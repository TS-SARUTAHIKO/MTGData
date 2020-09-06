package com.xxxsarutahikoxxx.kotlin.MTGData.Structure

import com.xxxsarutahikoxxx.kotlin.MTGData.Utils.CString


// CommonInfo
val CommonInfo.name : CString get() = property["name"] as CString
var MutableInfo.name : CString get() = mutableProperty["name"] as CString ; set(value) { mutableProperty["name"] = value }

val CommonInfo.symbols : List<ManaSymbol> get() = property["symbols"] as List<ManaSymbol>
var MutableInfo.symbols : List<ManaSymbol> get() = mutableProperty["symbols"] as List<ManaSymbol> ; set(value) { mutableProperty["symbols"] = value }

val CommonInfo.cmc : Int get() = property["cmc"] as Int
var MutableInfo.cmc : Int get() = mutableProperty["cmc"] as Int ; set(value) { mutableProperty["cmc"] = value }

val CommonInfo.color : Set<Color> get() = property["color"] as Set<Color>
var MutableInfo.color : Set<Color> get() = mutableProperty["color"] as Set<Color> ; set(value) { mutableProperty["color"] = value }

val CommonInfo.colorIdentity : Set<Color> get() = property["colorIdentity"] as Set<Color>
var MutableInfo.colorIdentity : Set<Color> get() = mutableProperty["colorIdentity"] as Set<Color> ; set(value) { mutableProperty["colorIdentity"] = value }

val CommonInfo.supertype : Set<SuperType> get() = property["supertype"] as Set<SuperType>
var MutableInfo.supertype : Set<SuperType> get() = mutableProperty["supertype"] as Set<SuperType> ; set(value) { mutableProperty["supertype"] = value }

val CommonInfo.cardtype : Set<CardType> get() = property["cardtype"] as Set<CardType>
var MutableInfo.cardtype : Set<CardType> get() = mutableProperty["cardtype"] as Set<CardType> ; set(value) { mutableProperty["cardtype"] = value }

val CommonInfo.subtype : Set<SubType> get() = property["subtype"] as Set<SubType>
var MutableInfo.subtype : Set<SubType> get() = mutableProperty["subtype"] as Set<SubType> ; set(value) { mutableProperty["subtype"] = value }

val CommonInfo.ruleText : CString get() = property["ruleText"] as CString
var MutableInfo.ruleText : CString get() = mutableProperty["ruleText"] as CString ; set(value) { mutableProperty["ruleText"] = value }

val CommonInfo.power : Int get() = property["power"] as Int
var MutableInfo.power : Int get() = mutableProperty["power"] as Int ; set(value) { mutableProperty["power"] = value }

val CommonInfo.toughness : Int get() = property["toughness"] as Int
var MutableInfo.toughness : Int get() = mutableProperty["toughness"] as Int ; set(value) { mutableProperty["toughness"] = value }

val CommonInfo.loyalty : Int get() = property["loyalty"] as Int
var MutableInfo.loyalty : Int get() = mutableProperty["loyalty"] as Int ; set(value) { mutableProperty["loyalty"] = value }

val CommonInfo.handModifier : Int get() = property["handModifier"] as Int
var MutableInfo.handModifier : Int get() = mutableProperty["handModifier"] as Int ; set(value) { mutableProperty["handModifier"] = value }

val CommonInfo.lifeModifier : Int get() = property["lifeModifier"] as Int
var MutableInfo.lifeModifier : Int get() = mutableProperty["lifeModifier"] as Int ; set(value) { mutableProperty["lifeModifier"] = value }

val CommonInfo.allsets : Map<CardSetType, List<Rarity>> get() = property["allsets"] as Map<CardSetType, List<Rarity>>
var MutableInfo.allsets : Map<CardSetType, List<Rarity>> get() = mutableProperty["allsets"] as Map<CardSetType, List<Rarity>> ; set(value) { mutableProperty["allsets"] = value }


// PersonalInfo
val PersonalInfo.cardset : CardSetType get() = property["cardset"] as CardSetType
var MutableInfo.cardset : CardSetType get() = mutableProperty["cardset"] as CardSetType ; set(value) { mutableProperty["cardset"] = value }

val PersonalInfo.rarity : Rarity get() = property["rarity"] as Rarity
var MutableInfo.rarity : Rarity get() = mutableProperty["rarity"] as Rarity ; set(value) { mutableProperty["rarity"] = value }

val PersonalInfo.flavorText : CString get() = property["flavorText"] as CString
var MutableInfo.flavorText : CString get() = mutableProperty["flavorText"] as CString ; set(value) { mutableProperty["flavorText"] = value }

val PersonalInfo.watermark : Set<Watermark> get() = property["watermark"] as Set<Watermark>
var MutableInfo.watermark : Set<Watermark> get() = mutableProperty["watermark"] as Set<Watermark> ; set(value) { mutableProperty["watermark"] = value }

val PersonalInfo.artists : Set<Artist> get() = property["artists"] as Set<Artist>
var MutableInfo.artists : Set<Artist> get() = mutableProperty["artists"] as Set<Artist> ; set(value) { mutableProperty["artists"] = value }

val PersonalInfo.number : Pair<Int, String> get() = property["number"] as Pair<Int, String>
var MutableInfo.number : Pair<Int, String> get() = mutableProperty["number"] as Pair<Int, String> ; set(value) { mutableProperty["number"] = value }

val PersonalInfo.multiverseID : Int get() = property["multiverseID"] as Int
var MutableInfo.multiverseID : Int get() = mutableProperty["multiverseID"] as Int ; set(value) { mutableProperty["multiverseID"] = value }

