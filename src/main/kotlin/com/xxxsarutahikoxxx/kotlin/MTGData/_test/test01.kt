package com.xxxsarutahikoxxx.kotlin.MTGData._test

import com.xxxsarutahikoxxx.kotlin.MTGData.Condition.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.CardSet.*
import javax.swing.JFrame

var out : Any?
    get() = null
    set(value) { println(value) }


fun main() {

    CardSets.decodeCardSet()

    CardSets().cards { Red and Dragon and Creature }.forEach {
        out = it.name
    }

    JFrame().apply {
        defaultCloseOperation =JFrame.EXIT_ON_CLOSE
        isVisible = true
    }
}
