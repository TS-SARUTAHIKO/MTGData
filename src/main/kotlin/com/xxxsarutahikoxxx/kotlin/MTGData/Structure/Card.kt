package com.xxxsarutahikoxxx.kotlin.MTGData.Structure


interface Info {
    val property : Map<String, Any?>
}
interface MutableInfo : Info {
    val mutableProperty : MutableMap<String, Any?>
}


interface CommonInfo : Info
interface PersonalInfo : Info
interface CardData : CommonInfo, PersonalInfo
interface GatheringInfo : Info
interface MyCard : CardData, GatheringInfo
interface RefreshTable : CardData

interface GameState : Info
interface MarkerPool : Info
interface BattleState : Info
interface DrivenTable : GameState, MarkerPool, BattleState

interface Card : RefreshTable, DrivenTable


typealias ciCondition = (CommonInfo)->(Boolean)
typealias piCondition = (PersonalInfo)->(Boolean)
typealias cdCondition = (CardData)->(Boolean)
typealias giCondition = (GatheringInfo)->(Boolean)
typealias mcCondition = (MyCard)->(Boolean)
typealias rtCondition = (RefreshTable)->(Boolean)
typealias mpCondition = (MarkerPool)->(Boolean)
typealias bsCondition = (BattleState)->(Boolean)
typealias dtCondition = (DrivenTable)->(Boolean)
typealias cCondition  = (Card)->(Boolean)

interface ciFactory
interface piFactory
interface cdFactory : ciFactory, piFactory
interface giFactory
interface mcFactory : cdFactory, giFactory
interface rtFactory : cdFactory
interface mpFactory
interface bsFactory
interface dtFactory : mpFactory, bsFactory
interface cFactory : rtFactory, dtFactory


class cdMixer private constructor() : cdFactory {
    infix fun cdCondition.and(con : cdCondition ) : cdCondition = { this(it) && con(it) }
    infix fun cdCondition.or(con : cdCondition ) : cdCondition = { this(it) || con(it) }
    operator fun cdCondition.not() : cdCondition = { ! this(it) }
    fun and(cons : Iterable<cdCondition>) : cdCondition {
        val list = cons.toList()
        return { cd : CardData -> list.all { it(cd) } }
    }
    fun or(cons : Iterable<cdCondition>) : cdCondition {
        val list = cons.toList()
        return { cd : CardData -> list.any { it(cd) } }
    }

    companion object {
        internal val _INSTANCE = cdMixer()
    }
}
fun rCardData( func : cdMixer.()->(cdCondition) ) : cdCondition = cdMixer._INSTANCE.func()

class cMixer private constructor() : cFactory {
    infix fun cCondition.and(con : cCondition ) : cCondition = { this(it) && con(it) }
    infix fun cCondition.or(con : cCondition ) : cCondition = { this(it) || con(it) }
    operator fun cCondition.not() : cCondition = { ! this(it) }
    fun and(cons : Iterable<cCondition>) : cCondition {
        val list = cons.toList()
        return { cd : Card -> list.all { it(cd) } }
    }
    fun or(cons : Iterable<cCondition>) : cCondition {
        val list = cons.toList()
        return { cd : Card -> list.any { it(cd) } }
    }

    companion object {
        internal val _INSTANCE = cMixer()
    }
}
fun rCard( func : cMixer.()->(cCondition) ) : cCondition = cMixer._INSTANCE.func()


internal class CardDataImpl : CardData, MutableInfo {
    override val mutableProperty: MutableMap<String, Any?> = mutableMapOf()
    override val property: Map<String, Any?> get() = mutableProperty.toMap()
}
internal class CardImpl : Card, MutableInfo {
    override val mutableProperty: MutableMap<String, Any?> = mutableMapOf()
    override val property: Map<String, Any?> get() = mutableProperty.toMap()
}
