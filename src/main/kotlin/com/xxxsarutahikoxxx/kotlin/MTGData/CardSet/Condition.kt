package com.xxxsarutahikoxxx.kotlin.MTGData.CardSet


typealias csCondition = (CardSet)->(Boolean)
interface csFactory

class csMixer private constructor() : csFactory {
    infix fun csCondition.and(con : csCondition ) : csCondition = { this(it) && con(it) }
    infix fun csCondition.or(con : csCondition ) : csCondition = { this(it) || con(it) }
    operator fun csCondition.not() : csCondition = { ! this(it) }
    fun and(cons : Iterable<csCondition>) : csCondition {
        val list = cons.toList()
        return { cs -> list.all { it(cs) } }
    }
    fun or(cons : Iterable<csCondition>) : csCondition {
        val list = cons.toList()
        return { cs -> list.any { it(cs) } }
    }

    companion object {
        internal val _INSTANCE = csMixer()
    }
}
fun rCardSet( func : csMixer.()->(csCondition) ) : csCondition = csMixer._INSTANCE.func()




