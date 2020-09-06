package com.xxxsarutahikoxxx.kotlin.MTGData.Condition

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Type.*


// Name
fun ciFactory.name(name : String) : ciCondition = { name in it.name.codes }
fun ciFactory.nameOr(names : Iterable<String>) : ciCondition = { ci -> names.any { it in ci.name.codes } }

fun ciFactory.nameContains(name : String) : ciCondition = { it.name.codes.any { name in it } }
fun ciFactory.nameContainsAnd(names : Iterable<String>) : ciCondition = { ci -> names.all { nameContains(it)(ci) } }
fun ciFactory.nameContainsOr(names : Iterable<String>) : ciCondition = { ci -> names.any { nameContains(it)(ci) } }


// Rule Text
fun ciFactory.ruleContains(rule : String) : ciCondition = { it.ruleText.codes.any { rule in it } }
fun ciFactory.ruleContainsAnd(rules : Iterable<String>) : ciCondition = { ci -> rules.all { ruleContains(it)(ci) } }
fun ciFactory.ruleContainsOr(rules : Iterable<String>) : ciCondition = { ci -> rules.any { ruleContains(it)(ci) } }


// Flavor Text
fun piFactory.flavorContains(flavor : String) : piCondition = { it.flavorText.codes.any { flavor in it } }
fun piFactory.flavorContainsAnd(flavors : Iterable<String>) : piCondition = { ci -> flavors.all { flavorContains(it)(ci) } }
fun piFactory.flavorContainsOr(flavors : Iterable<String>) : piCondition = { ci -> flavors.any { flavorContains(it)(ci) } }


// All Set
fun cdFactory.hasCardSet(cardset : CardSetType) : cdCondition = { cardset in it.allsets.keys }
fun cdFactory.hasCardSetAnd(cardsets : Iterable<CardSetType>) : cdCondition = { cd -> cardsets.all { it in cd.allsets.keys } }
fun cdFactory.hasCardSetOr(cardsets : Iterable<CardSetType>) : cdCondition = { cd -> cardsets.any { it in cd.allsets.keys } }

fun cdFactory.hasRarity(rarity : Rarity) : cdCondition = { rarity in it.allsets.values.flatten() }
fun cdFactory.hasRarityAnd(rarities : Iterable<Rarity>) : cdCondition = { cd -> rarities.all { it in cd.allsets.values.flatten() } }
fun cdFactory.hasRarityOr(rarities : Iterable<Rarity>) : cdCondition = { cd -> rarities.any { it in cd.allsets.values.flatten() } }


// Watermark
fun piFactory.watermark(watermark : Watermark) : piCondition = { watermark in it.watermark }
fun piFactory.watermarkAnd(watermarks : Iterable<Watermark>) : piCondition = { ci -> watermarks.all { it in ci.watermark } }
fun piFactory.watermarkOr(watermarks : Iterable<Watermark>) : piCondition = { ci -> watermarks.any { it in ci.watermark } }

val piFactory.Azorius : piCondition get() = watermark(Watermarks.Azorius)
val piFactory.Dimir : piCondition get() = watermark(Watermarks.Dimir)
val piFactory.Rakdos : piCondition get() = watermark(Watermarks.Rakdos)
val piFactory.Gruul : piCondition get() = watermark(Watermarks.Gruul)
val piFactory.Selesnya : piCondition get() = watermark(Watermarks.Selesnya)
val piFactory.Orzhov : piCondition get() = watermark(Watermarks.Orzhov)
val piFactory.Golgari : piCondition get() = watermark(Watermarks.Golgari)
val piFactory.Simic : piCondition get() = watermark(Watermarks.Simic)
val piFactory.Izzet : piCondition get() = watermark(Watermarks.Izzet)
val piFactory.Boros : piCondition get() = watermark(Watermarks.Boros)
val piFactory.Phyrexian : piCondition get() = watermark(Watermarks.Phyrexian)
val piFactory.Mirran : piCondition get() = watermark(Watermarks.Mirran)
val piFactory.Abzan : piCondition get() = watermark(Watermarks.Abzan)
val piFactory.Jeskai : piCondition get() = watermark(Watermarks.Jeskai)
val piFactory.Sultai : piCondition get() = watermark(Watermarks.Sultai)
val piFactory.Mardu : piCondition get() = watermark(Watermarks.Mardu)
val piFactory.Temur : piCondition get() = watermark(Watermarks.Temur)
val piFactory.Ojutai : piCondition get() = watermark(Watermarks.Ojutai)
val piFactory.Silumgar : piCondition get() = watermark(Watermarks.Silumgar)
val piFactory.Kolaghan : piCondition get() = watermark(Watermarks.Kolaghan)
val piFactory.Atarka : piCondition get() = watermark(Watermarks.Atarka)
val piFactory.Dromoka : piCondition get() = watermark(Watermarks.Dromoka)

