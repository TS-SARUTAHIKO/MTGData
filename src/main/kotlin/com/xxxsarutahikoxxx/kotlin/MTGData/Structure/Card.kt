package com.xxxsarutahikoxxx.kotlin.MTGData.Structure

import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.CardSet
import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.CardSets
import java.io.Serializable


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


typealias ciCondition = (CommonInfo)->(Boolean)
typealias piCondition = (PersonalInfo)->(Boolean)
typealias cdCondition = (CardData)->(Boolean)
typealias giCondition = (GatheringInfo)->(Boolean)
typealias mcCondition = (MyCard)->(Boolean)

interface ciFactory
interface piFactory
interface cdFactory : ciFactory, piFactory
interface giFactory
interface mcFactory : cdFactory, giFactory


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

internal class CardDataImpl : CardData, MutableInfo, Serializable {
    override val mutableProperty: MutableMap<String, Any?> = mutableMapOf()
    override val property: Map<String, Any?> get() = mutableProperty.toMap()

    fun writeReplace(): Any? {
        val set : CardSet = (this as PersonalInfo).cardset.run { CardSets.of(this) }
        return CardDataPointer(set.type, set.cards.indexOf(this))
    }
}
internal class CardDataPointer(
    val type : CardSetType,
    val index : Int
) : Serializable {
    fun readResolve(): Any? = CardSets.of(type).cards[index]
}