package com.xxxsarutahikoxxx.kotlin.MTGData.Structure

import com.xxxsarutahikoxxx.kotlin.MTGData.Type.*
import java.io.Serializable
import java.lang.RuntimeException


interface Base {
    val codes : List<String>
    val obsoleted : Boolean

    operator fun contains(code : String) : Boolean = codes.any { it.equals(code, true) }
}

interface Symbol : Base, Comparable<Symbol> {
    override fun compareTo(other: Symbol): Int {
        return _Symbols.indexOf(this) - _Symbols.indexOf(other)
    }
}
interface ManaSymbol : Symbol {
    val value : Int
}
interface HybridManaSymbol : ManaSymbol
interface FriendlyHybridSymbol : HybridManaSymbol
interface EnemyHybridSymbol : HybridManaSymbol
interface MonoHybridSymbol : HybridManaSymbol
interface PhyrexianHybridSymbol : HybridManaSymbol
interface NumericalManaSymbol : ManaSymbol
interface MutableManaSymbol : ManaSymbol

interface Color : Base
interface Rarity : Base
interface CardSetType : Base

interface SuperType : Base
interface CardType : Base
interface SubType : Base
interface CreatureType : SubType
interface ArtifactType : SubType
interface EnchantmentType : SubType
interface SpellType : SubType
interface PlaneType : SubType
interface PlaneswalkerType : SubType
interface LandType : SubType
interface BasicLandType : LandType

interface Watermark : Base
interface Artist : Base

interface ResourceType : Base
interface ManaType : ResourceType
interface MarkerType : ResourceType
interface PTMarkerType : MarkerType



//
open class BaseImpl(override val codes : List<String>) : Base, Serializable {
    override fun toString(): String = codes.joinToString("/")
    override val obsoleted : Boolean = false

    init {
        instances.putIfAbsent(this::class.java, mutableListOf(this))?.add(this)
    }

    fun writeReplace(): Any? {
        return BasePointer(this::class.java, codes.first())
    }

    companion object {
        val instances : MutableMap<Class<out Base>, MutableList<BaseImpl>> = mutableMapOf()

        inline fun <reified Type : Base> of(code : String) : Type {
            return instances.values.flatten().first { it is Type && code in it.codes } as Type
        }
        inline fun <reified Type : Base> values() : List<Type> {
            return instances.values.flatten().filterIsInstance(Type::class.java)
        }
    }
}
internal class BasePointer(
    val clazz : Class<out Base>,
    val code : String
) : Serializable {
    fun readResolve(): Any? {
        return BaseImpl.instances[clazz]?.first { code in it.codes }
            ?: throw RuntimeException("BasePointerError : $clazz : $code")
    }
}

abstract class BaseCompanion<TYPE : Base> {
    abstract fun values() : List<TYPE>
    fun of(code : String) = values().firstOrNull { code in it } ?: throw RuntimeException("Not Found : $code : ${values()}")
}

class Symbols(codes : List<String>) : BaseImpl(codes), Symbol {
    companion object : BaseCompanion<Symbol>() {
        override fun values() : List<Symbol> = BaseImpl.values()
    }
}
class ManaSymbols(codes : List<String>) : BaseImpl(codes), ManaSymbol {
    override val value: Int = 1

    companion object : BaseCompanion<ManaSymbol>() {
        override fun values() : List<ManaSymbol> = BaseImpl.values()
    }
}
class HybridManaSymbols(codes : List<String>) : BaseImpl(codes), HybridManaSymbol {
    override val value: Int = 1

    companion object : BaseCompanion<HybridManaSymbol>() {
        override fun values() : List<HybridManaSymbol> = BaseImpl.values()
    }
}
class FriendlyHybridSymbols(codes : List<String>) : BaseImpl(codes), FriendlyHybridSymbol {
    override val value: Int = 1

    companion object : BaseCompanion<FriendlyHybridSymbol>() {
        override fun values() : List<FriendlyHybridSymbol> = BaseImpl.values()
    }
}
class EnemyHybridSymbols(codes : List<String>) : BaseImpl(codes), EnemyHybridSymbol {
    override val value: Int = 1

    companion object : BaseCompanion<EnemyHybridSymbol>() {
        override fun values() : List<EnemyHybridSymbol> = BaseImpl.values()
    }
}
class MonoHybridSymbols(codes : List<String>) : BaseImpl(codes), MonoHybridSymbol {
    override val value: Int = 2

    companion object : BaseCompanion<MonoHybridSymbol>() {
        override fun values() : List<MonoHybridSymbol> = BaseImpl.values()
    }
}
class PhyrexianHybridSymbols(codes : List<String>) : BaseImpl(codes), PhyrexianHybridSymbol {
    override val value: Int = 1

    companion object : BaseCompanion<PhyrexianHybridSymbol>() {
        override fun values() : List<PhyrexianHybridSymbol> = BaseImpl.values()
    }
}
class NumericalManaSymbols(codes : List<String>) : BaseImpl(codes), NumericalManaSymbol {
    override val value: Int = codes[0].toInt()

    companion object : BaseCompanion<NumericalManaSymbol>() {
        override fun values() : List<NumericalManaSymbol> = BaseImpl.values()
    }
}
class MutableManaSymbols(codes : List<String>) : BaseImpl(codes), MutableManaSymbol {
    override val value: Int = 0

    companion object : BaseCompanion<MutableManaSymbol>() {
        override fun values() : List<MutableManaSymbol> = BaseImpl.values()
    }
}

class Colors(codes : List<String>) : BaseImpl(codes), Color {
    companion object : BaseCompanion<Color>() {
        override fun values() : List<Color> = BaseImpl.values()
    }
}
class Rarities(codes : List<String>) : BaseImpl(codes), Rarity {
    companion object : BaseCompanion<Rarity>() {
        override fun values() : List<Rarity> = BaseImpl.values()
    }
}
class CardSetTypes(codes : List<String>) : BaseImpl(codes), CardSetType {
    companion object : BaseCompanion<CardSetType>() {
        override fun values() : List<CardSetType> = BaseImpl.values()
    }
}

class SuperTypes(codes : List<String>) : BaseImpl(codes), SuperType {
    companion object : BaseCompanion<SuperType>() {
        override fun values() : List<SuperType> = BaseImpl.values()
    }
}
class CardTypes(codes : List<String>) : BaseImpl(codes), CardType {
    companion object : BaseCompanion<CardType>() {
        override fun values() : List<CardType> = BaseImpl.values()
    }
}
class SubTypes(codes : List<String>) : BaseImpl(codes), SubType {
    companion object : BaseCompanion<SubType>() {
        override fun values() : List<SubType> = BaseImpl.values()
    }
}
class CreatureTypes(codes : List<String>) : BaseImpl(codes), CreatureType {
    companion object : BaseCompanion<CreatureType>() {
        override fun values() : List<CreatureType> = BaseImpl.values()
    }
}
class ArtifactTypes(codes : List<String>) : BaseImpl(codes), ArtifactType {
    companion object : BaseCompanion<ArtifactType>() {
        override fun values() : List<ArtifactType> = BaseImpl.values()
    }
}
class EnchantmentTypes(codes : List<String>) : BaseImpl(codes), EnchantmentType {
    companion object : BaseCompanion<EnchantmentType>() {
        override fun values() : List<EnchantmentType> = BaseImpl.values()
    }
}
class SpellTypes(codes : List<String>) : BaseImpl(codes), SpellType {
    companion object : BaseCompanion<SpellType>() {
        override fun values() : List<SpellType> = BaseImpl.values()
    }
}
class PlaneTypes(codes : List<String>) : BaseImpl(codes), PlaneType {
    companion object : BaseCompanion<PlaneType>() {
        override fun values() : List<PlaneType> = BaseImpl.values()
    }
}
class PlaneswalkerTypes(codes : List<String>) : BaseImpl(codes), PlaneswalkerType {
    companion object : BaseCompanion<PlaneswalkerType>() {
        override fun values() : List<PlaneswalkerType> = BaseImpl.values()
    }
}
class LandTypes(codes : List<String>) : BaseImpl(codes), LandType {
    companion object : BaseCompanion<LandType>() {
        override fun values() : List<LandType> = BaseImpl.values()
    }
}
class BasicLandTypes(codes : List<String>) : BaseImpl(codes), BasicLandType {
    companion object : BaseCompanion<BasicLandType>() {
        override fun values() : List<BasicLandType> = BaseImpl.values()
    }
}

class Watermarks(codes : List<String>) : BaseImpl(codes), Watermark {
    companion object : BaseCompanion<Watermark>() {
        override fun values() : List<Watermark> = BaseImpl.values()
    }
}
class Artists(codes : List<String>) : BaseImpl(codes), Artist {
    companion object : BaseCompanion<Artist>() {
        override fun values() : List<Artist> = BaseImpl.values()
    }
}

class ResourceTypes(codes : List<String>) : BaseImpl(codes), ResourceType {
    companion object : BaseCompanion<ResourceType>() {
        override fun values() : List<ResourceType> = BaseImpl.values()
    }
}
class ManaTypes(codes : List<String>) : BaseImpl(codes), ManaType {
    companion object : BaseCompanion<ManaType>() {
        override fun values() : List<ManaType> = BaseImpl.values()
    }
}
class MarkerTypes(codes : List<String>) : BaseImpl(codes), MarkerType {
    companion object : BaseCompanion<MarkerType>() {
        override fun values() : List<MarkerType> = BaseImpl.values()
    }
}
class PTMarkerTypes(codes : List<String>) : BaseImpl(codes), PTMarkerType {
    companion object : BaseCompanion<PTMarkerType>() {
        override fun values() : List<PTMarkerType> = BaseImpl.values()
    }
}


val _inits = _initTypes && _initSubTypes && _initOthers && _initCardSets