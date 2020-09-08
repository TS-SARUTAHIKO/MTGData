package com.xxxsarutahikoxxx.kotlin.MTGData._test

import com.xxxsarutahikoxxx.kotlin.MTGData.Condition.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Type.Core_Set_2021
import com.xxxsarutahikoxxx.kotlin.MTGData.Utils.CString
import java.io.ByteArrayInputStream
import java.io.ByteArrayOutputStream
import java.io.ObjectInputStream
import java.io.ObjectOutputStream
import javax.swing.JFrame

internal var out : Any?
    get() = null
    set(value) { println(value) }


fun main() {
    _inits

    CardSets.decodeCardSet()

    CardSets().cards { Red and Dragon and Creature }.forEach {
        out = it.name
    }

//    JFrame().apply {
//        defaultCloseOperation =JFrame.EXIT_ON_CLOSE
//        isVisible = true
//    }

    val M21 = CardSets.of(CardSetTypes.Core_Set_2021)
    out = "$M21 : ${equivalent(M21)}"
}

fun equivalent(obj : Any?) : Boolean {
    ByteArrayOutputStream().use {
        ObjectOutputStream(it).use {
            it.writeObject(obj)
        }
        ByteArrayInputStream(it.toByteArray()).use {
            ObjectInputStream(it).use {
                return it.readObject() == obj
            }
        }
    }
}
