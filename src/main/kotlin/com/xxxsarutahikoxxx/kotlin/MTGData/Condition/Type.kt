package com.xxxsarutahikoxxx.kotlin.MTGData.Condition

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Type.*


// Color
fun ciFactory.color(color : Color) : ciCondition = { color in it.color }
fun ciFactory.colorAnd(colors : Iterable<Color>) : ciCondition = { ci -> colors.all { it in ci.color } }
fun ciFactory.colorOr(colors : Iterable<Color>) : ciCondition = { ci -> colors.any { it in ci.color } }

val ciFactory.White : ciCondition get() = color(Colors.White)
val ciFactory.Blue : ciCondition get() = color(Colors.Blue)
val ciFactory.Black : ciCondition get() = color(Colors.Black)
val ciFactory.Red : ciCondition get() = color(Colors.Red)
val ciFactory.Green : ciCondition get() = color(Colors.Green)

val ciFactory.NonColor : ciCondition get() = { it.color.size == 0 }
val ciFactory.MonoColor : ciCondition get() = { it.color.size == 1 }
val ciFactory.Colored : ciCondition get() = { it.color.size >= 1 }
val ciFactory.MultiColor : ciCondition get() = { it.color.size >= 2 }


// Color
fun ciFactory.colorIdentity(color : Color) : ciCondition = { color in it.colorIdentity }
fun ciFactory.colorIdentityAnd(colors : Iterable<Color>) : ciCondition = { ci -> colors.all { it in ci.colorIdentity } }
fun ciFactory.colorIdentityOr(colors : Iterable<Color>) : ciCondition = { ci -> colors.any { it in ci.colorIdentity } }

val ciFactory.iWhite : ciCondition get() = colorIdentity(Colors.White)
val ciFactory.iBlue : ciCondition get() = colorIdentity(Colors.Blue)
val ciFactory.iBlack : ciCondition get() = colorIdentity(Colors.Black)
val ciFactory.iRed : ciCondition get() = colorIdentity(Colors.Red)
val ciFactory.iGreen : ciCondition get() = colorIdentity(Colors.Green)

val ciFactory.iNonColor : ciCondition get() = { it.colorIdentity.size == 0 }
val ciFactory.iMonoColor : ciCondition get() = { it.colorIdentity.size == 1 }
val ciFactory.iColored : ciCondition get() = { it.colorIdentity.size >= 1 }
val ciFactory.iMultiColor : ciCondition get() = { it.colorIdentity.size >= 2 }


// Rarity
fun piFactory.rarity(rarity : Rarity) : piCondition = { rarity == it.rarity }
fun piFactory.rarityOr(rarities : Iterable<Rarity>) : piCondition = { pi -> rarities.any { it == pi.rarity } }

val piFactory.Common : piCondition get() = rarity(Rarities.Common)
val piFactory.Uncommon : piCondition get() = rarity(Rarities.Uncommon)
val piFactory.Rare : piCondition get() = rarity(Rarities.Rare)
val piFactory.Mythic : piCondition get() = rarity(Rarities.Mythic)
val piFactory.rLand : piCondition get() = rarity(Rarities.Land)
val piFactory.rSpecial : piCondition get() = rarity(Rarities.Special)
val piFactory.rOther : piCondition get() = rarity(Rarities.Other)


// SuperType
fun ciFactory.supertype(supertype : SuperType) : ciCondition = { supertype in it.supertype }
fun ciFactory.supertypeAnd(supertypes : Iterable<SuperType>) : ciCondition = { ci -> supertypes.all { it in ci.supertype } }
fun ciFactory.supertypeOr(supertypes : Iterable<SuperType>) : ciCondition = { ci -> supertypes.any { it in ci.supertype } }

val ciFactory.Basic : ciCondition get() = supertype(SuperTypes.Basic)
val ciFactory.Legendary : ciCondition get() = supertype(SuperTypes.Legendary)
val ciFactory.Ongoing : ciCondition get() = supertype(SuperTypes.Ongoing)
val ciFactory.Snow : ciCondition get() = supertype(SuperTypes.Snow)
val ciFactory.World : ciCondition get() = supertype(SuperTypes.World)
val ciFactory.Elite : ciCondition get() = supertype(SuperTypes.Elite)
val ciFactory.Host : ciCondition get() = supertype(SuperTypes.Host)


// CardType
fun ciFactory.cardtype(cardtype : CardType) : ciCondition = { cardtype in it.cardtype }
fun ciFactory.cardtypeAnd(cardtypes : Iterable<CardType>) : ciCondition = { ci -> cardtypes.all { it in ci.cardtype } }
fun ciFactory.cardtypeOr(cardtypes : Iterable<CardType>) : ciCondition = { ci -> cardtypes.any { it in ci.cardtype } }

val ciFactory.Creature : ciCondition get() = cardtype(CardTypes.Creature)
val ciFactory.Tribal : ciCondition get() = cardtype(CardTypes.Tribal)
val ciFactory.Land : ciCondition get() = cardtype(CardTypes.Land)
val ciFactory.Artifact : ciCondition get() = cardtype(CardTypes.Artifact)
val ciFactory.Enchantment : ciCondition get() = cardtype(CardTypes.Enchantment)
val ciFactory.Planeswalker : ciCondition get() = cardtype(CardTypes.Planeswalker)
val ciFactory.Instant : ciCondition get() = cardtype(CardTypes.Instant)
val ciFactory.Sorcery : ciCondition get() = cardtype(CardTypes.Sorcery)
val ciFactory.Vanguard : ciCondition get() = cardtype(CardTypes.Vanguard)
val ciFactory.Conspiracy : ciCondition get() = cardtype(CardTypes.Conspiracy)
val ciFactory.Phenomenon : ciCondition get() = cardtype(CardTypes.Phenomenon)
val ciFactory.Plane : ciCondition get() = cardtype(CardTypes.Plane)


// CMC
fun ciFactory.cmc(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.cmc) }
fun ciFactory.cmc(num : Int ) : ciCondition = cmc { it == num }

// Power
fun ciFactory.power(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.power) }
fun ciFactory.power(num : Int ) : ciCondition = power { it == num }

// Toughness
fun ciFactory.toughness(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.toughness) }
fun ciFactory.toughness(num : Int ) : ciCondition = toughness { it == num }

// Loyalty
fun ciFactory.loyalty(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.loyalty) }
fun ciFactory.loyalty(num : Int ) : ciCondition = loyalty { it == num }

// HandModifier
fun ciFactory.handModifier(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.handModifier) }
fun ciFactory.handModifier(num : Int ) : ciCondition = handModifier { it == num }

// LifeModifier
fun ciFactory.lifeModifier(filter : (Int)->(Boolean) ) : ciCondition = { filter(it.lifeModifier) }
fun ciFactory.lifeModifier(num : Int ) : ciCondition = lifeModifier { it == num }

// MultiverseID
fun piFactory.multiverseID(filter : (Int)->(Boolean) ) : piCondition = { filter(it.multiverseID) }
fun piFactory.multiverseID(num : Int ) : piCondition = multiverseID { it == num }


// ManaSymbol
fun ciFactory.symbols(symbols : Iterable<Symbol>) : ciCondition = { it.symbols.sorted() == symbols.sorted() }
fun ciFactory.symbolsAnd(symbols : Iterable<Symbol>) : ciCondition = { ci -> symbols.all { it in ci.symbols } }
fun ciFactory.symbolsOr(symbols : Iterable<Symbol>) : ciCondition = { ci -> symbols.any { it in ci.symbols } }

val ciFactory.hasHybridMana : ciCondition get() = symbolsOr( HybridManaSymbols.values() )
val ciFactory.hasFriendlyHybrid : ciCondition get() = symbolsOr( FriendlyHybridSymbols.values() )
val ciFactory.hasEnemyHybrid : ciCondition get() = symbolsOr( EnemyHybridSymbols.values() )
val ciFactory.hasMonoHybrid : ciCondition get() = symbolsOr( MonoHybridSymbols.values() )
val ciFactory.hasPhyrexianHybrid : ciCondition get() = symbolsOr( PhyrexianHybridSymbols.values() )
val ciFactory.hasMutableMana : ciCondition get() = symbolsOr( MutableManaSymbols.values() )

fun ciFactory.devotionW(filter : (Int)->(Boolean)) : ciCondition = { filter( it.symbols.count(rSymbol { devotionW }) ) }
fun ciFactory.devotionU(filter : (Int)->(Boolean)) : ciCondition = { filter( it.symbols.count(rSymbol { devotionU }) ) }
fun ciFactory.devotionB(filter : (Int)->(Boolean)) : ciCondition = { filter( it.symbols.count(rSymbol { devotionB }) ) }
fun ciFactory.devotionR(filter : (Int)->(Boolean)) : ciCondition = { filter( it.symbols.count(rSymbol { devotionR }) ) }
fun ciFactory.devotionG(filter : (Int)->(Boolean)) : ciCondition = { filter( it.symbols.count(rSymbol { devotionG }) ) }
fun ciFactory.devotionW(num : Int) : ciCondition = devotionW { it == num }
fun ciFactory.devotionU(num : Int) : ciCondition = devotionU { it == num }
fun ciFactory.devotionB(num : Int) : ciCondition = devotionB { it == num }
fun ciFactory.devotionR(num : Int) : ciCondition = devotionR { it == num }
fun ciFactory.devotionG(num : Int) : ciCondition = devotionG { it == num }

