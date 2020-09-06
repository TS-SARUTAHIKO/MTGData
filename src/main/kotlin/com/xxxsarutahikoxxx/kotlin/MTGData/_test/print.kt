package com.xxxsarutahikoxxx.kotlin.MTGData._test

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.Base

inline fun <reified Type : Base> printTypeList(list : List<List<String>> ){
    val type = "${ Type::class.java.simpleName }"

    val list = list.map {
        listOf(
            it.first().replace(Regex("""[-^@;:,./!"#$%&'()=~|`{+*}<>?_]"""), "").replace(" ", "_"),
            *it.toTypedArray()
        )
    }

    list.forEach {
        val str = it.subList(1, it.size).joinToString(", "){ "\"$it\"" }

        out = "    private val _${it[0]} : $type = ${type}s(listOf($str))"
    }
    out = ""
    list.forEach {
        out = "    val ${type}s.Companion.${it[0]} : $type get() = _${it[0]}"
    }
}
inline fun <reified Type : Base> printType( list : List<String> ){
    printTypeList<Type>( list.map { listOf(it) } )
}
