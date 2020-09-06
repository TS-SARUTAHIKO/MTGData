package com.xxxsarutahikoxxx.kotlin.MTGData.Utils

import java.util.*


class CString(val code : String, vararg pair : Pair<Locale, String>) {
    private val map : MutableMap<Locale, String> = mutableMapOf(*pair)

    val codes : List<String> get() = listOf(code, *map.values.toTypedArray())

    operator fun get(locale : Locale) : String? = map[locale]
    operator fun set(locale : Locale, value : String){ map[locale] = value }

    fun toString(locale : Locale) : String = get(locale) ?: code
    override fun toString(): String = toString(language)

    companion object {
        var language : Locale = Locale.ENGLISH
    }
}
