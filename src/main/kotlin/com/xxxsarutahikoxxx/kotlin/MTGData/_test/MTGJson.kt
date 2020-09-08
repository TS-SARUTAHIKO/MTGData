package com.xxxsarutahikoxxx.kotlin.MTGData._test

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.CardSet
import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.CardSets
import com.xxxsarutahikoxxx.kotlin.MTGData.Utils.CString
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json
import kotlinx.serialization.json.JsonObject
import java.lang.Exception


fun CardSets.Companion.decodeCardSet(line : String) : CardSet {
    _inits

    val set : jCardSet = Json { ignoreUnknownKeys = false }.decodeFromString<jCardSetHost>(line).data
    return set.toCardSet()
}
fun CardSets.Companion.decodeCardSet(){
    _inits

    val stream = ClassLoader.getSystemResource("AllPrintings.json").openStream()

    stream.use {
        it.bufferedReader().use {
            val host = Json { ignoreUnknownKeys = true }.decodeFromString<jAllPrintingsHost>( it.readLines().joinToString("\n") )
            host.data.toCardSets()
        }
    }
}

fun CardSets.Companion.names() : List<List<String>> {
    val line = ClassLoader.getSystemResource("AllPrintings.json").readText()

    val host = Json { ignoreUnknownKeys = false }.decodeFromString<JsonObject>(line)
    val map : Map<String, JsonObject> = host["data"] as Map<String, JsonObject>

    return map.mapNotNull {
        // コアセットと拡張セットのみを対象とする
        if( it.value["type"].toString() in listOf("\"core\"", "\"expansion\"") ){
            val code = it.key
            val name = it.value["name"].toString().run { substring(1, length-1) }
            val fName = name.replace(Regex("""[-^@;:,./!"#$%&'()=~|`{+*}<>?_]"""), "").replace("  ", " "). replace(Regex(" "), "_")

            listOf(name, code)
        }else{
            null
        }
    }
}


@Serializable
data class jAllPrintingsHost(
        val data : jAllPrintings,
        val meta : jMeta
)
@Serializable
data class jAllPrintings(
        @SerialName("10E") val _10E : jCardSet,
        @SerialName("2ED") val _2ED : jCardSet,
        @SerialName("3ED") val _3ED : jCardSet,
        @SerialName("4BB") val _4BB : jCardSet,
        @SerialName("4ED") val _4ED : jCardSet,
        @SerialName("5DN") val _5DN : jCardSet,
        @SerialName("5ED") val _5ED : jCardSet,
        @SerialName("6ED") val _6ED : jCardSet,
        @SerialName("7ED") val _7ED : jCardSet,
        @SerialName("8ED") val _8ED : jCardSet,
        @SerialName("9ED") val _9ED : jCardSet,
        @SerialName("AER") val _AER : jCardSet,
        @SerialName("AKH") val _AKH : jCardSet,
        @SerialName("ALA") val _ALA : jCardSet,
        @SerialName("ALL") val _ALL : jCardSet,
        @SerialName("APC") val _APC : jCardSet,
        @SerialName("ARB") val _ARB : jCardSet,
        @SerialName("ARN") val _ARN : jCardSet,
        @SerialName("ATQ") val _ATQ : jCardSet,
        @SerialName("AVR") val _AVR : jCardSet,
        @SerialName("BFZ") val _BFZ : jCardSet,
        @SerialName("BNG") val _BNG : jCardSet,
        @SerialName("BOK") val _BOK : jCardSet,
        @SerialName("CHK") val _CHK : jCardSet,
        @SerialName("CON") val _CON : jCardSet,
        @SerialName("CSP") val _CSP : jCardSet,
        @SerialName("DGM") val _DGM : jCardSet,
        @SerialName("DIS") val _DIS : jCardSet,
        @SerialName("DKA") val _DKA : jCardSet,
        @SerialName("DOM") val _DOM : jCardSet,
        @SerialName("DRK") val _DRK : jCardSet,
        @SerialName("DST") val _DST : jCardSet,
        @SerialName("DTK") val _DTK : jCardSet,
        @SerialName("ELD") val _ELD : jCardSet,
        @SerialName("EMN") val _EMN : jCardSet,
        @SerialName("EVE") val _EVE : jCardSet,
        @SerialName("EXO") val _EXO : jCardSet,
        @SerialName("FBB") val _FBB : jCardSet,
        @SerialName("FEM") val _FEM : jCardSet,
        @SerialName("FRF") val _FRF : jCardSet,
        @SerialName("FUT") val _FUT : jCardSet,
        @SerialName("GPT") val _GPT : jCardSet,
        @SerialName("GRN") val _GRN : jCardSet,
        @SerialName("GTC") val _GTC : jCardSet,
        @SerialName("HML") val _HML : jCardSet,
        @SerialName("HOU") val _HOU : jCardSet,
        @SerialName("ICE") val _ICE : jCardSet,
        @SerialName("IKO") val _IKO : jCardSet,
        @SerialName("INV") val _INV : jCardSet,
        @SerialName("ISD") val _ISD : jCardSet,
        @SerialName("JOU") val _JOU : jCardSet,
        @SerialName("JUD") val _JUD : jCardSet,
        @SerialName("KLD") val _KLD : jCardSet,
        @SerialName("KTK") val _KTK : jCardSet,
        @SerialName("LEA") val _LEA : jCardSet,
        @SerialName("LEB") val _LEB : jCardSet,
        @SerialName("LEG") val _LEG : jCardSet,
        @SerialName("LGN") val _LGN : jCardSet,
        @SerialName("LRW") val _LRW : jCardSet,
        @SerialName("M10") val _M10 : jCardSet,
        @SerialName("M11") val _M11 : jCardSet,
        @SerialName("M12") val _M12 : jCardSet,
        @SerialName("M13") val _M13 : jCardSet,
        @SerialName("M14") val _M14 : jCardSet,
        @SerialName("M15") val _M15 : jCardSet,
        @SerialName("M19") val _M19 : jCardSet,
        @SerialName("M20") val _M20 : jCardSet,
        @SerialName("M21") val _M21 : jCardSet,
        @SerialName("MBS") val _MBS : jCardSet,
        @SerialName("MIR") val _MIR : jCardSet,
        @SerialName("MMQ") val _MMQ : jCardSet,
        @SerialName("MOR") val _MOR : jCardSet,
        @SerialName("MRD") val _MRD : jCardSet,
        @SerialName("NEM") val _NEM : jCardSet,
        @SerialName("NPH") val _NPH : jCardSet,
        @SerialName("ODY") val _ODY : jCardSet,
        @SerialName("OGW") val _OGW : jCardSet,
        @SerialName("ONS") val _ONS : jCardSet,
        @SerialName("ORI") val _ORI : jCardSet,
        @SerialName("PCY") val _PCY : jCardSet,
        @SerialName("PLC") val _PLC : jCardSet,
        @SerialName("PLS") val _PLS : jCardSet,
        @SerialName("RAV") val _RAV : jCardSet,
        @SerialName("RIX") val _RIX : jCardSet,
        @SerialName("RNA") val _RNA : jCardSet,
        @SerialName("ROE") val _ROE : jCardSet,
        @SerialName("RTR") val _RTR : jCardSet,
        @SerialName("SCG") val _SCG : jCardSet,
        @SerialName("SHM") val _SHM : jCardSet,
        @SerialName("SOI") val _SOI : jCardSet,
        @SerialName("SOK") val _SOK : jCardSet,
        @SerialName("SOM") val _SOM : jCardSet,
        @SerialName("STH") val _STH : jCardSet,
        @SerialName("SUM") val _SUM : jCardSet,
        @SerialName("THB") val _THB : jCardSet,
        @SerialName("THS") val _THS : jCardSet,
        @SerialName("TMP") val _TMP : jCardSet,
        @SerialName("TOR") val _TOR : jCardSet,
        @SerialName("TSB") val _TSB : jCardSet,
        @SerialName("TSP") val _TSP : jCardSet,
        @SerialName("UDS") val _UDS : jCardSet,
        @SerialName("ULG") val _ULG : jCardSet,
        @SerialName("USG") val _USG : jCardSet,
        @SerialName("VIS") val _VIS : jCardSet,
        @SerialName("WAR") val _WAR : jCardSet,
        @SerialName("WTH") val _WTH : jCardSet,
        @SerialName("WWK") val _WWK : jCardSet,
        @SerialName("XLN") val _XLN : jCardSet,
        @SerialName("ZEN") val _ZEN : jCardSet,
        @SerialName("ZNR") val _ZNR : jCardSet
){
    fun toCardSets(){
        jAllPrintings::class.java.declaredFields.forEach {
            it.isAccessible = true
            (it.get(this) as? jCardSet)?.toCardSet()
        }
    }
}

@Serializable
data class jCardSetHost(
        val data : jCardSet,
        val meta : jMeta
)
@Serializable
data class jCardSet(
        val name : String,
        val code : String,
        val block : String? = null,

        val cards : List<jCard>,
        val tokens : List<jCard> = listOf(),
        val baseSetSize : Int,
        val totalSetSize : Int,

        val booster : jBooster? = null,
        val releaseDate : String,

        val type : String,
        val isFoilOnly : Boolean = false,
        val isOnlineOnly : Boolean = false,
        val keyruneCode : String? = null,
        val mtgoCode : String? = null,
        val tcgplayerGroupId : Int? = null,
        val translations : jTranslations
){
    fun toCardSet() : CardSet {
        return CardSets(
            CardSetTypes.of(code),
            cards.filter { "★" !in it.number }.map { it.toCardData() } // ホイル専用のデータは除去する
        )
    }
}
@Serializable
data class jMeta(
    val date : String,
    val version : String
)
@Serializable
data class jBooster(
    val default : JsonObject
)
@Serializable
data class jCard(
        val name : String = "",
        val manaCost : String = "",
        val convertedManaCost : Double = 0.0,
        val colors : List<String> = listOf(),
        val colorIdentity : List<String> = listOf(),
        val supertypes : List<String> = listOf(),
        val types : List<String> = listOf(),
        val subtypes : List<String> = listOf(),
        val setCode : String = "",
        val rarity : String = "",
        val text : String = "",
        val flavorText : String = "",
        val power : String = "",
        val toughness : String = "",
        val loyalty : String = "",
        val number : String = "",
        val artist : String = "",

        val faceName : String = "",
        val faceConvertedManaCost : Double = 0.0,
        val otherFaceIds : List<String> = listOf(),
        val side : String = "",
        val colorIndicator : List<String> = listOf(),

        val foreignData : List<jForeignData> = listOf(),
        val identifiers : jIdentifiers,
        val variations : List<String> = listOf(),
        val legalities : jLegalities? = null,
        val availability : List<String> = listOf(),
        val borderColor : String = "",
        val frameEffects : List<String> = listOf(),
        val frameVersion : String = "",
        val hasFoil : Boolean? = null,
        val hasNonFoil : Boolean? = null,
        val isReprint : Boolean = false,
        val isOnlineOnly : Boolean = false,
        val isStarter : Boolean? = null,
        val layout : String = "",
        val originalText : String = "",
        val originalType : String = "",
        val printings : List<String> = listOf(),
        val purchaseUrls : jPurchaseUrls? = null,
        val rulings : List<jRulings> = listOf(),
        val type : String = "",
        val uuid : String = "",
        val edhrecRank : Int? = null,
        val keywords : List<String> = listOf(),
        val promoTypes : List<String> = listOf(),
        val leadershipSkills : jLeadershipSkills? = null,
        val isPromo : Boolean = false,
        val reverseRelated : List<String> = listOf()
){
    fun toCardData() : CardData {
        return (CardDataImpl() as MutableInfo).also {
            it.name = CString(name)

            it.cmc = convertedManaCost.toInt()

            it.symbols = manaCost.replace("{", "")
                .split("}").filter { it.isNotEmpty() }.map { ManaSymbols.of(it) }

            it.color = colors.map { Colors.of(it) }.toSet()
            it.colorIdentity = colorIdentity.map { Colors.of(it) }.toSet()

            it.supertype = supertypes.map { SuperTypes.of(it) }.toSet()
            it.cardtype = types.map { CardTypes.of(it) }.toSet()
            it.subtype = subtypes.map { SubTypes.of(it) }.toSet()

            it.cardset = CardSetTypes.of(setCode)
            it.rarity = Rarities.of(rarity)

            it.ruleText = CString(text)
            it.flavorText = CString(flavorText)

            it.power = power.toINT
            it.toughness = toughness.toINT
            it.loyalty = loyalty.toINT
        } as CardData
    }

    private val String.toINT get() = try{ Regex("[-0-9]").findAll(this).joinToString("").toInt() }catch (e : Exception){ 0 }
}
@Serializable
data class jForeignData(
    val language : String = "",
    val name : String = "",
    val type : String = "",
    val text : String = "",
    val flavorText : String = "",
    val multiverseId : Int? = null
)
@Serializable
data class jIdentifiers(
    val cardKingdomFoilId : String? = "",
    val cardKingdomId : String = "",
    val mtgArenaId : String = "",
    val mtgjsonV4Id : String = "",
    val mtgoId : String = "",
    val multiverseId : String = "",
    val scryfallId : String = "",
    val scryfallIllustrationId : String = "",
    val scryfallOracleId : String = "",
    val tcgplayerProductId : String = ""
)
@Serializable
data class jLegalities(
    val penny : String = "",
    val brawl : String = "",
    val commander : String = "",
    val duel : String = "",
    val future : String = "",
    val historic : String = "",
    val legacy : String = "",
    val modern : String = "",
    val pauper : String = "",
    val pioneer : String = "",
    val standard : String = "",
    val vintage : String = ""
)
@Serializable
data class jPurchaseUrls(
    val cardKingdom : String = "",
    val cardKingdomFoil : String = "",
    val tcgplayer : String = ""
)
@Serializable
data class jRulings(
    val date : String = "",
    val text : String = ""
)
@Serializable
data class jLeadershipSkills(
    val brawl : Boolean,
    val commander : Boolean,
    val oathbreaker : Boolean
)
@Serializable
data class jTranslations(
    @SerialName("Chinese Simplified")
    val ChineseSimplified : String? = null,
    @SerialName("Chinese Traditional")
    val ChineseTraditional : String? = null,
    val French : String? = null,
    val German : String? = null,
    val Italian : String? = null,
    val Japanese : String? = null,
    val Korean : String? = null,
    @SerialName("Portuguese (Brazil)")
    val PortugueseBrazil : String? = null,
    val Russian : String? = null,
    val Spanish : String? = null
)