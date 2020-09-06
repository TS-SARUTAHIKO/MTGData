
# MTG のデータを扱うためのデータクラス

# 概要

カードデータはシンプルな Map<String, Any> 構造のデータとして [Info] インターフェースによって保持される
[Info]はデータの呼び出しだけを保証し、書き換えは[MutableInfo]インターフェースによって行う
カードデータの実装は以下のような非常にシンプルな実装で可能となる

```carddata.kt
internal class CardDataImpl : CardData, MutableInfo {
    override val mutableProperty: MutableMap<String, Any?> = mutableMapOf()
    override val property: Map<String, Any?> get() = mutableProperty.toMap()
}
```

カードプロパティの参照は [Structure.Property] ファイルに定義した拡張関数によって行う
実装は次のようなシンプルな形となる

```property.kt
val CommonInfo.name : CString get() = property["name"] as CString
```

# パッケージ構成

## MTGData.Structure

[MTGData.Structure.Card] : カード構造を構造分解した各インターフェースの定義、それに対応した条件オブジェクトと条件オブジェクトのファクトリの定義
[MTGData.Structure.Property] : カード情報へのアクセスのための関数定義
[MTGData.Structure.Type] : タイプ情報の定義と実装
[MTGData.Structure.Others] : その他、マナシンボルの条件オブジェクトとミキサーの定義など

## MTGData.Type パッケージ

カードの定義済の各タイプ情報の実装

[MTGData.Type.Type] : 色・レアリティ・スーパータイプ・カードタイプなどの実装
[MTGData.Type.SubType] : クリーチャータイプ・土地タイプなどのサブタイプの実装
[MTGData.Type.Others] : ウォーターマーク・マーカータイプなどの実装
[MTGData.Type.CardSet] : カードセットを表す[CardSetType]の実装


## MTGData.Condition パッケージ

カードの条件オブジェクトの実装

[MTGData.Type.Type] : 色・レアリティ・スーパータイプ・カードタイプなどに関する条件オブジェクトの実装
[MTGData.Type.SubType] : クリーチャータイプ・土地タイプなどのサブタイプに関する条件オブジェクトの実装
[MTGData.Type.Others] : ウォーターマーク・カード名・ルールテキストなどに関する条件オブジェクトの実装
[MTGData.Type.CardSet] : カードセットに関する条件オブジェクトの実装


# カードの構造分解

MTG のカード・プロパティはその属性によってカテゴリーに分けられる

[CommonInfo] : 再録や絵違い版によっても変化しないカードの共通部分の情報 (e.g.) マナコスト・色<br>
[PersonalInfo] : 再録や絵違い版によって変化する個別の情報 (e.g.) アーティスト・レアリティ<br>
[CardCard] : [CommonInfo]と[PersonalInfo]を継承したカードデータ<br>
[GatheringInfo] : 収集情報 (e.g.) 入手日など<br>
[MyCard] : [CardData]と[GatheringInfo]を継承した個別カードデータ<br>
[RefreshTable] : [CardData]とコントローラー・リソースデータなどの常時更新されるデータ部分<br>

[GameState] : ゲームに関する情報 (e.g.) オーナー・ゾーン・タイムスタンプ <br>
[MarkerPool] : カードに乗っているカウンター情報<br>
[BattleState] : カードの戦闘に関する情報<br>
[DrivenTable] : [GameState] [MarkerPool] [BattleState]を継承した駆動型データ部分<br>

[Card] : [RefreshTable]と[DrivenTable]を継承したカードデータ

# 新規タイプの追加

新規にタイプを追加するには3ステップを行う
以下で`New Type`という名前の`CreatureType`を追加する例を示す

1. 実体の定義、ただしグローバル・ネーム領域の汚染を避けるために `private` を付加すること
2. CreatureTypes.Companion から呼び出しできるように拡張関数を定義する
3. 条件オブジェクトを呼び出しができるように、条件オブジェクトのファクトリクラス ciFactory に対する拡張関数を定義する

`MTGData.Type`・`MTGData.Condition` パッケージによって既存のタイプに対して上記の追加を行っている

```type.kt
private val _NewType : CreatureType = CreatureTypes(listOf("New Type"))

val CreatureTypes.Companion.NewType : CreatureType get() = _NewType

val ciFactory.NewType : ciCondition get() = subtype(CreatureTypes.NewType)
```

