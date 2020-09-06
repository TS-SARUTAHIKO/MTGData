package com.xxxsarutahikoxxx.kotlin.MTGData.Structure

import com.xxxsarutahikoxxx.kotlin.MTGData.Utils.CString


// CommonInfo
val CommonInfo.name : CString get() = property["name"] as CString

val CommonInfo.symbols : List<ManaSymbol> get() = property["symbols"] as List<ManaSymbol>
val CommonInfo.cmc : Int get() = property["cmc"] as Int
val CommonInfo.color : Set<Color> get() = property["color"] as Set<Color>
val CommonInfo.colorIdentity : Set<Color> get() = property["colorIdentity"] as Set<Color>

val CommonInfo.supertype : Set<SuperType> get() = property["supertype"] as Set<SuperType>
val CommonInfo.cardtype : Set<CardType> get() = property["cardtype"] as Set<CardType>
val CommonInfo.subtype : Set<SubType> get() = property["subtype"] as Set<SubType>

val CommonInfo.ruleText : CString get() = property["ruleText"] as CString

val CommonInfo.power : Int get() = property["power"] as Int
val CommonInfo.toughness : Int get() = property["toughness"] as Int
val CommonInfo.loyalty : Int get() = property["loyalty"] as Int

val CommonInfo.handModifier : Int get() = property["handModifier"] as Int
val CommonInfo.lifeModifier : Int get() = property["lifeModifier"] as Int

val CommonInfo.allsets : Map<CardSetType, List<Rarity>> get() = property["allsets"] as Map<CardSetType, List<Rarity>>


// PersonalInfo
val PersonalInfo.cardset : CardSetType get() = property["cardset"] as CardSetType
val PersonalInfo.rarity : Rarity get() = property["rarity"] as Rarity

val PersonalInfo.flavorText : CString get() = property["flavorText"] as CString

val PersonalInfo.watermark : Set<Watermark> get() = property["watermark"] as Set<Watermark>
val PersonalInfo.artists : Set<Artist> get() = property["artists"] as Set<Artist>
val PersonalInfo.number : Pair<Int, String> get() = property["number"] as Pair<Int, String>

val PersonalInfo.multiverseID : Int get() = property["multiverseID"] as Int