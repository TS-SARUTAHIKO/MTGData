package com.xxxsarutahikoxxx.kotlin.MTGData.Structure

import com.xxxsarutahikoxxx.kotlin.MTGData.Type.*


typealias sCondition = (Symbol)->(Boolean)

interface sFactory

class sMixer private constructor() : sFactory {
    infix fun sCondition.and(con : sCondition ) : sCondition = { this(it) && con(it) }
    infix fun sCondition.or(con : sCondition ) : sCondition = { this(it) || con(it) }
    operator fun sCondition.not() : sCondition = { ! this(it) }
    fun and(cons : Iterable<sCondition>) : sCondition {
        val list = cons.toList()
        return { s : Symbol -> list.all { it(s) } }
    }
    fun or(cons : Iterable<sCondition>) : sCondition {
        val list = cons.toList()
        return { s : Symbol -> list.any { it(s) } }
    }

    companion object {
        internal val _INSTANCE = sMixer()
    }
}
fun rSymbol( func : sMixer.()->(sCondition) ) : sCondition = sMixer._INSTANCE.func()


val sFactory.devotionW : sCondition get() = { it in _WFamily }
val sFactory.devotionU : sCondition get() = { it in _UFamily }
val sFactory.devotionB : sCondition get() = { it in _BFamily }
val sFactory.devotionR : sCondition get() = { it in _RFamily }
val sFactory.devotionG : sCondition get() = { it in _GFamily }
