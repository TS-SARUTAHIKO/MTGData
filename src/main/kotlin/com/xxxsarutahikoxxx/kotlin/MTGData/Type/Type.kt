package com.xxxsarutahikoxxx.kotlin.MTGData.Type

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*


// TODO : Artist

// Color
private val _White : Color = Colors(listOf("White", "W"))
private val _Blue : Color = Colors(listOf("Blue", "U"))
private val _Black : Color = Colors(listOf("Black", "B"))
private val _Red : Color = Colors(listOf("Red", "R"))
private val _Green : Color = Colors(listOf("Green", "G"))

val Colors.Companion.White : Color get() = _White
val Colors.Companion.Blue : Color get() = _Blue
val Colors.Companion.Black : Color get() = _Black
val Colors.Companion.Red : Color get() = _Red
val Colors.Companion.Green : Color get() = _Green


// Rarity
private val _Common : Rarity = Rarities(listOf("Common"))
private val _Uncommon : Rarity = Rarities(listOf("Uncommon"))
private val _Rare : Rarity = Rarities(listOf("Rare"))
private val _Mythic : Rarity = Rarities(listOf("Mythic"))
private val _rLand : Rarity = Rarities(listOf("Land"))
private val _rSpecial : Rarity = Rarities(listOf("Special"))
private val _rOther : Rarity = Rarities(listOf("Other"))

val Rarities.Companion.Common : Rarity get() = _Common
val Rarities.Companion.Uncommon : Rarity get() = _Uncommon
val Rarities.Companion.Rare : Rarity get() = _Rare
val Rarities.Companion.Mythic : Rarity get() = _Mythic
val Rarities.Companion.Land : Rarity get() = _rLand
val Rarities.Companion.Special : Rarity get() = _rSpecial
val Rarities.Companion.Other : Rarity get() = _rOther


// SuperType
private val _Basic : SuperType = SuperTypes(listOf("Basic"))
private val _Legendary : SuperType = SuperTypes(listOf("Legendary"))
private val _Ongoing : SuperType = SuperTypes(listOf("Ongoing"))
private val _Snow : SuperType = SuperTypes(listOf("Snow"))
private val _World : SuperType = SuperTypes(listOf("World"))
private val _Elite : SuperType = SuperTypes(listOf("Elite"))
private val _Host : SuperType = SuperTypes(listOf("Host"))

val SuperTypes.Companion.Basic : SuperType get() = _Basic
val SuperTypes.Companion.Legendary : SuperType get() = _Legendary
val SuperTypes.Companion.Ongoing : SuperType get() = _Ongoing
val SuperTypes.Companion.Snow : SuperType get() = _Snow
val SuperTypes.Companion.World : SuperType get() = _World
val SuperTypes.Companion.Elite : SuperType get() = _Elite
val SuperTypes.Companion.Host : SuperType get() = _Host


// CardType
private val _Creature : CardType = CardTypes(listOf("Creature"))
private val _Tribal : CardType = CardTypes(listOf("Tribal"))
private val _Land : CardType = CardTypes(listOf("Land"))
private val _Artifact : CardType = CardTypes(listOf("Artifact"))
private val _Enchantment : CardType = CardTypes(listOf("Enchantment"))
private val _Planeswalker : CardType = CardTypes(listOf("Planeswalker"))
private val _Instant : CardType = CardTypes(listOf("Instant"))
private val _Sorcery : CardType = CardTypes(listOf("Sorcery"))
private val _Vanguard : CardType = CardTypes(listOf("Vanguard"))
private val _Conspiracy : CardType = CardTypes(listOf("Conspiracy"))
private val _Phenomenon : CardType = CardTypes(listOf("Phenomenon"))
private val _Plane : CardType = CardTypes(listOf("Plane"))

val CardTypes.Companion.Creature : CardType get() = _Creature
val CardTypes.Companion.Tribal : CardType get() = _Tribal
val CardTypes.Companion.Land : CardType get() = _Land
val CardTypes.Companion.Artifact : CardType get() = _Artifact
val CardTypes.Companion.Enchantment : CardType get() = _Enchantment
val CardTypes.Companion.Planeswalker : CardType get() = _Planeswalker
val CardTypes.Companion.Instant : CardType get() = _Instant
val CardTypes.Companion.Sorcery : CardType get() = _Sorcery
val CardTypes.Companion.Vanguard : CardType get() = _Vanguard
val CardTypes.Companion.Conspiracy : CardType get() = _Conspiracy
val CardTypes.Companion.Phenomenon : CardType get() = _Phenomenon
val CardTypes.Companion.Plane : CardType get() = _Plane


// Mana
private val _rN : ManaType = ManaTypes(listOf("N"))
private val _rW : ManaType = ManaTypes(listOf("W"))
private val _rU : ManaType = ManaTypes(listOf("U"))
private val _rB : ManaType = ManaTypes(listOf("B"))
private val _rR : ManaType = ManaTypes(listOf("R"))
private val _rG : ManaType = ManaTypes(listOf("G"))

val ManaTypes.Companion.N : ManaType get() = _rN
val ManaTypes.Companion.W : ManaType get() = _rW
val ManaTypes.Companion.U : ManaType get() = _rU
val ManaTypes.Companion.B : ManaType get() = _rB
val ManaTypes.Companion.R : ManaType get() = _rR
val ManaTypes.Companion.G : ManaType get() = _rG


// Symbol
private val _Tap : Symbol = Symbols(listOf("Tap", "tap", "T"))
private val _Untap : Symbol = Symbols(listOf("Untap", "untap", "Q"))

val Symbols.Companion.Tap : Symbol get() = _Tap
val Symbols.Companion.Untap : Symbol get() = _Untap


// ManaSymbol
private val _N : ManaSymbol = ManaSymbols(listOf("N", "C"))
private val _S : ManaSymbol = ManaSymbols(listOf("S"))

private val _W : ManaSymbol = ManaSymbols(listOf("W"))
private val _U : ManaSymbol = ManaSymbols(listOf("U"))
private val _B : ManaSymbol = ManaSymbols(listOf("B"))
private val _R : ManaSymbol = ManaSymbols(listOf("R"))
private val _G : ManaSymbol = ManaSymbols(listOf("G"))

val ManaSymbols.Companion.N : ManaSymbol get() = _N
val ManaSymbols.Companion.S : ManaSymbol get() = _S

val ManaSymbols.Companion.W : ManaSymbol get() = _W
val ManaSymbols.Companion.U : ManaSymbol get() = _U
val ManaSymbols.Companion.B : ManaSymbol get() = _B
val ManaSymbols.Companion.R : ManaSymbol get() = _R
val ManaSymbols.Companion.G : ManaSymbol get() = _G

// Friendly HybridSymbol
private val _WU : FriendlyHybridSymbol = FriendlyHybridSymbols(listOf("WU", "W/U"))
private val _UB : FriendlyHybridSymbol = FriendlyHybridSymbols(listOf("UB", "U/B"))
private val _BR : FriendlyHybridSymbol = FriendlyHybridSymbols(listOf("BR", "B/R"))
private val _RG : FriendlyHybridSymbol = FriendlyHybridSymbols(listOf("RG", "R/G"))
private val _GW : FriendlyHybridSymbol = FriendlyHybridSymbols(listOf("GW", "G/W"))

val FriendlyHybridSymbols.Companion.WU : FriendlyHybridSymbol get() = _WU
val FriendlyHybridSymbols.Companion.UB : FriendlyHybridSymbol get() = _UB
val FriendlyHybridSymbols.Companion.BR : FriendlyHybridSymbol get() = _BR
val FriendlyHybridSymbols.Companion.RG : FriendlyHybridSymbol get() = _RG
val FriendlyHybridSymbols.Companion.GW : FriendlyHybridSymbol get() = _GW

// Enemy HybridSymbol
private val _WB : EnemyHybridSymbol = EnemyHybridSymbols(listOf("WB", "W/B"))
private val _BG : EnemyHybridSymbol = EnemyHybridSymbols(listOf("BG", "B/G"))
private val _GU : EnemyHybridSymbol = EnemyHybridSymbols(listOf("GU", "G/U"))
private val _UR : EnemyHybridSymbol = EnemyHybridSymbols(listOf("UR", "U/R"))
private val _RW : EnemyHybridSymbol = EnemyHybridSymbols(listOf("RW", "R/W"))

val EnemyHybridSymbols.Companion.WB : EnemyHybridSymbol get() = _WB
val EnemyHybridSymbols.Companion.BG : EnemyHybridSymbol get() = _BG
val EnemyHybridSymbols.Companion.GU : EnemyHybridSymbol get() = _GU
val EnemyHybridSymbols.Companion.UR : EnemyHybridSymbol get() = _UR
val EnemyHybridSymbols.Companion.RW : EnemyHybridSymbol get() = _RW

// Mono HybridSymbol
private val _W2 : MonoHybridSymbol = MonoHybridSymbols(listOf("W2", "2W", "W/2", "2/W"))
private val _U2 : MonoHybridSymbol = MonoHybridSymbols(listOf("U2", "2U", "U/2", "2/U"))
private val _B2 : MonoHybridSymbol = MonoHybridSymbols(listOf("B2", "2B", "B/2", "2/B"))
private val _R2 : MonoHybridSymbol = MonoHybridSymbols(listOf("R2", "2R", "R/2", "2/R"))
private val _G2 : MonoHybridSymbol = MonoHybridSymbols(listOf("G2", "2G", "G/2", "2/G"))

val MonoHybridSymbols.Companion.W2 : MonoHybridSymbol get() = _W2
val MonoHybridSymbols.Companion.U2 : MonoHybridSymbol get() = _U2
val MonoHybridSymbols.Companion.B2 : MonoHybridSymbol get() = _B2
val MonoHybridSymbols.Companion.R2 : MonoHybridSymbol get() = _R2
val MonoHybridSymbols.Companion.G2 : MonoHybridSymbol get() = _G2

// Phyrexian HybridSymbol
private val _WP : PhyrexianHybridSymbol = PhyrexianHybridSymbols(listOf("WP", "PW", "W/P", "P/W"))
private val _UP : PhyrexianHybridSymbol = PhyrexianHybridSymbols(listOf("UP", "PU", "U/P", "P/U"))
private val _BP : PhyrexianHybridSymbol = PhyrexianHybridSymbols(listOf("BP", "PB", "B/P", "P/B"))
private val _RP : PhyrexianHybridSymbol = PhyrexianHybridSymbols(listOf("RP", "PR", "R/P", "P/R"))
private val _GP : PhyrexianHybridSymbol = PhyrexianHybridSymbols(listOf("GP", "PG", "G/P", "P/G"))

val PhyrexianHybridSymbols.Companion.WP : PhyrexianHybridSymbol get() = _WP
val PhyrexianHybridSymbols.Companion.UP : PhyrexianHybridSymbol get() = _UP
val PhyrexianHybridSymbols.Companion.BP : PhyrexianHybridSymbol get() = _BP
val PhyrexianHybridSymbols.Companion.RP : PhyrexianHybridSymbol get() = _RP
val PhyrexianHybridSymbols.Companion.GP : PhyrexianHybridSymbol get() = _GP

// ManaSymbols.Companion への追加
val ManaSymbols.Companion.n0 : NumericalManaSymbol get() = _n0
val ManaSymbols.Companion.n1 : NumericalManaSymbol get() = _n1
val ManaSymbols.Companion.n2 : NumericalManaSymbol get() = _n2
val ManaSymbols.Companion.n3 : NumericalManaSymbol get() = _n3
val ManaSymbols.Companion.n4 : NumericalManaSymbol get() = _n4
val ManaSymbols.Companion.n5 : NumericalManaSymbol get() = _n5
val ManaSymbols.Companion.n6 : NumericalManaSymbol get() = _n6
val ManaSymbols.Companion.n7 : NumericalManaSymbol get() = _n7
val ManaSymbols.Companion.n8 : NumericalManaSymbol get() = _n8
val ManaSymbols.Companion.n9 : NumericalManaSymbol get() = _n9
val ManaSymbols.Companion.n10 : NumericalManaSymbol get() = _n10
val ManaSymbols.Companion.n11 : NumericalManaSymbol get() = _n11
val ManaSymbols.Companion.n12 : NumericalManaSymbol get() = _n12
val ManaSymbols.Companion.n13 : NumericalManaSymbol get() = _n13
val ManaSymbols.Companion.n14 : NumericalManaSymbol get() = _n14
val ManaSymbols.Companion.n15 : NumericalManaSymbol get() = _n15
val ManaSymbols.Companion.n16 : NumericalManaSymbol get() = _n16

val ManaSymbols.Companion.X : MutableManaSymbol get() = _X
val ManaSymbols.Companion.Y : MutableManaSymbol get() = _Y

val ManaSymbols.Companion.WU : FriendlyHybridSymbol get() = _WU
val ManaSymbols.Companion.UB : FriendlyHybridSymbol get() = _UB
val ManaSymbols.Companion.BR : FriendlyHybridSymbol get() = _BR
val ManaSymbols.Companion.RG : FriendlyHybridSymbol get() = _RG
val ManaSymbols.Companion.GW : FriendlyHybridSymbol get() = _GW

val ManaSymbols.Companion.WB : EnemyHybridSymbol get() = _WB
val ManaSymbols.Companion.BG : EnemyHybridSymbol get() = _BG
val ManaSymbols.Companion.GU : EnemyHybridSymbol get() = _GU
val ManaSymbols.Companion.UR : EnemyHybridSymbol get() = _UR
val ManaSymbols.Companion.RW : EnemyHybridSymbol get() = _RW

val ManaSymbols.Companion.W2 : MonoHybridSymbol get() = _W2
val ManaSymbols.Companion.U2 : MonoHybridSymbol get() = _U2
val ManaSymbols.Companion.B2 : MonoHybridSymbol get() = _B2
val ManaSymbols.Companion.R2 : MonoHybridSymbol get() = _R2
val ManaSymbols.Companion.G2 : MonoHybridSymbol get() = _G2

val ManaSymbols.Companion.WP : PhyrexianHybridSymbol get() = _WP
val ManaSymbols.Companion.UP : PhyrexianHybridSymbol get() = _UP
val ManaSymbols.Companion.BP : PhyrexianHybridSymbol get() = _BP
val ManaSymbols.Companion.RP : PhyrexianHybridSymbol get() = _RP
val ManaSymbols.Companion.GP : PhyrexianHybridSymbol get() = _GP

// HybridManaSymbols.Companion
val HybridManaSymbols.Companion.WU : FriendlyHybridSymbol get() = _WU
val HybridManaSymbols.Companion.UB : FriendlyHybridSymbol get() = _UB
val HybridManaSymbols.Companion.BR : FriendlyHybridSymbol get() = _BR
val HybridManaSymbols.Companion.RG : FriendlyHybridSymbol get() = _RG
val HybridManaSymbols.Companion.GW : FriendlyHybridSymbol get() = _GW

val HybridManaSymbols.Companion.WB : EnemyHybridSymbol get() = _WB
val HybridManaSymbols.Companion.BG : EnemyHybridSymbol get() = _BG
val HybridManaSymbols.Companion.GU : EnemyHybridSymbol get() = _GU
val HybridManaSymbols.Companion.UR : EnemyHybridSymbol get() = _UR
val HybridManaSymbols.Companion.RW : EnemyHybridSymbol get() = _RW

val HybridManaSymbols.Companion.W2 : MonoHybridSymbol get() = _W2
val HybridManaSymbols.Companion.U2 : MonoHybridSymbol get() = _U2
val HybridManaSymbols.Companion.B2 : MonoHybridSymbol get() = _B2
val HybridManaSymbols.Companion.R2 : MonoHybridSymbol get() = _R2
val HybridManaSymbols.Companion.G2 : MonoHybridSymbol get() = _G2

val HybridManaSymbols.Companion.WP : PhyrexianHybridSymbol get() = _WP
val HybridManaSymbols.Companion.UP : PhyrexianHybridSymbol get() = _UP
val HybridManaSymbols.Companion.BP : PhyrexianHybridSymbol get() = _BP
val HybridManaSymbols.Companion.RP : PhyrexianHybridSymbol get() = _RP
val HybridManaSymbols.Companion.GP : PhyrexianHybridSymbol get() = _GP

// Numerical ManaSymbol
private val _n0 : NumericalManaSymbol = NumericalManaSymbols(listOf("0"))
private val _n1 : NumericalManaSymbol = NumericalManaSymbols(listOf("1"))
private val _n2 : NumericalManaSymbol = NumericalManaSymbols(listOf("2"))
private val _n3 : NumericalManaSymbol = NumericalManaSymbols(listOf("3"))
private val _n4 : NumericalManaSymbol = NumericalManaSymbols(listOf("4"))
private val _n5 : NumericalManaSymbol = NumericalManaSymbols(listOf("5"))
private val _n6 : NumericalManaSymbol = NumericalManaSymbols(listOf("6"))
private val _n7 : NumericalManaSymbol = NumericalManaSymbols(listOf("7"))
private val _n8 : NumericalManaSymbol = NumericalManaSymbols(listOf("8"))
private val _n9 : NumericalManaSymbol = NumericalManaSymbols(listOf("9"))
private val _n10 : NumericalManaSymbol = NumericalManaSymbols(listOf("10"))
private val _n11 : NumericalManaSymbol = NumericalManaSymbols(listOf("11"))
private val _n12 : NumericalManaSymbol = NumericalManaSymbols(listOf("12"))
private val _n13 : NumericalManaSymbol = NumericalManaSymbols(listOf("13"))
private val _n14 : NumericalManaSymbol = NumericalManaSymbols(listOf("14"))
private val _n15 : NumericalManaSymbol = NumericalManaSymbols(listOf("15"))
private val _n16 : NumericalManaSymbol = NumericalManaSymbols(listOf("16"))

val NumericalManaSymbols.Companion.n0 : NumericalManaSymbol get() = _n0
val NumericalManaSymbols.Companion.n1 : NumericalManaSymbol get() = _n1
val NumericalManaSymbols.Companion.n2 : NumericalManaSymbol get() = _n2
val NumericalManaSymbols.Companion.n3 : NumericalManaSymbol get() = _n3
val NumericalManaSymbols.Companion.n4 : NumericalManaSymbol get() = _n4
val NumericalManaSymbols.Companion.n5 : NumericalManaSymbol get() = _n5
val NumericalManaSymbols.Companion.n6 : NumericalManaSymbol get() = _n6
val NumericalManaSymbols.Companion.n7 : NumericalManaSymbol get() = _n7
val NumericalManaSymbols.Companion.n8 : NumericalManaSymbol get() = _n8
val NumericalManaSymbols.Companion.n9 : NumericalManaSymbol get() = _n9
val NumericalManaSymbols.Companion.n10 : NumericalManaSymbol get() = _n10
val NumericalManaSymbols.Companion.n11 : NumericalManaSymbol get() = _n11
val NumericalManaSymbols.Companion.n12 : NumericalManaSymbol get() = _n12
val NumericalManaSymbols.Companion.n13 : NumericalManaSymbol get() = _n13
val NumericalManaSymbols.Companion.n14 : NumericalManaSymbol get() = _n14
val NumericalManaSymbols.Companion.n15 : NumericalManaSymbol get() = _n15
val NumericalManaSymbols.Companion.n16 : NumericalManaSymbol get() = _n16

// Mutable ManaSymbol
private val _X : MutableManaSymbol = MutableManaSymbols(listOf("X"))
private val _Y : MutableManaSymbol = MutableManaSymbols(listOf("Y"))

val MutableManaSymbols.Companion.X : MutableManaSymbol get() = _X
val MutableManaSymbols.Companion.Y : MutableManaSymbol get() = _Y


//
internal val _Symbols by lazy { Symbols.values() }

internal val _WFamily by lazy { ManaSymbols.values().filter { it.codes.any { "W" in it } } }
internal val _UFamily by lazy { ManaSymbols.values().filter { it.codes.any { "U" in it } } }
internal val _BFamily by lazy { ManaSymbols.values().filter { it.codes.any { "B" in it } } }
internal val _RFamily by lazy { ManaSymbols.values().filter { it.codes.any { "R" in it } } }
internal val _GFamily by lazy { ManaSymbols.values().filter { it.codes.any { "G" in it } } }


//internal val _initTypes = true