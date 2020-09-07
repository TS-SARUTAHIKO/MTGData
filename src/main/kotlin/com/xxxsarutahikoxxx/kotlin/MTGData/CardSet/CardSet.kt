package com.xxxsarutahikoxxx.kotlin.MTGData.CardSet

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*


interface CardSet {
    val type : CardSetType
    val cards : List<CardData>
}
class CardSets internal constructor(
    override val type: CardSetType,
    override val cards: List<CardData>
) : CardSet {
    init {
        instances.add(this)
    }

    companion object {
        internal val instances : MutableList<CardSet> = mutableListOf()
    }
}


fun CardSet.cards( distinct : Boolean = true, func : cdMixer.()->(cdCondition) ) : List<CardData> {
    return cards.filter(rCardData(func)).run { if( distinct ) this.distinctBy { it.name.code } else this }
}
fun Iterable<CardSet>.cards( distinct : Boolean = true, func : cdMixer.()->(cdCondition) ) : List<CardData> {
    return this.map { it.cards(distinct, func) }.flatten()
}

fun CardSets(filter: csMixer.() -> (csCondition) = { { true } }) : List<CardSet> = CardSets.instances.filter( rCardSet(filter) )


