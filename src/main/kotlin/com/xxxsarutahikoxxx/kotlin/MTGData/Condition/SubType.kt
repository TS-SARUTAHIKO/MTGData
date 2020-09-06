package com.xxxsarutahikoxxx.kotlin.MTGData.Condition

import com.xxxsarutahikoxxx.kotlin.MTGData.Structure.*
import com.xxxsarutahikoxxx.kotlin.MTGData.Type.*


// SubType
fun ciFactory.subtype(subtype : SubType) : ciCondition = { subtype in it.subtype }
fun ciFactory.subtypeAnd(subtypes : Iterable<SubType>) : ciCondition = { ci -> subtypes.all { it in ci.subtype } }
fun ciFactory.subtypeOr(subtypes : Iterable<SubType>) : ciCondition = { ci -> subtypes.any { it in ci.subtype } }


// ArtifactType
val ciFactory.Clue : ciCondition get() = subtype(ArtifactTypes.Clue)
val ciFactory.Contraption : ciCondition get() = subtype(ArtifactTypes.Contraption)
val ciFactory.Equipment : ciCondition get() = subtype(ArtifactTypes.Equipment)
val ciFactory.Food : ciCondition get() = subtype(ArtifactTypes.Food)
val ciFactory.Fortification : ciCondition get() = subtype(ArtifactTypes.Fortification)
val ciFactory.Gold : ciCondition get() = subtype(ArtifactTypes.Gold)
val ciFactory.Treasure : ciCondition get() = subtype(ArtifactTypes.Treasure)
val ciFactory.Vehicle : ciCondition get() = subtype(ArtifactTypes.Vehicle)


// EnchantmentType
val ciFactory.Aura : ciCondition get() = subtype(EnchantmentTypes.Aura)
val ciFactory.Cartouche : ciCondition get() = subtype(EnchantmentTypes.Cartouche)
val ciFactory.Curse : ciCondition get() = subtype(EnchantmentTypes.Curse)
val ciFactory.Saga : ciCondition get() = subtype(EnchantmentTypes.Saga)
val ciFactory.Shrine : ciCondition get() = subtype(EnchantmentTypes.Shrine)


// LandType
val ciFactory.Plains : ciCondition get() = subtype(LandTypes.Plains)
val ciFactory.Island : ciCondition get() = subtype(LandTypes.Island)
val ciFactory.Swamp : ciCondition get() = subtype(LandTypes.Swamp)
val ciFactory.Mountain : ciCondition get() = subtype(LandTypes.Mountain)
val ciFactory.Forest : ciCondition get() = subtype(LandTypes.Forest)
val ciFactory.Urzas : ciCondition get() = subtype(LandTypes.Urzas)
val ciFactory.Mine : ciCondition get() = subtype(LandTypes.Mine)
val ciFactory.PowerPlant : ciCondition get() = subtype(LandTypes.PowerPlant)
val ciFactory.Tower : ciCondition get() = subtype(LandTypes.Tower)
val ciFactory.Lair : ciCondition get() = subtype(LandTypes.Lair)
val ciFactory.Desert : ciCondition get() = subtype(LandTypes.Desert)
val ciFactory.Locus : ciCondition get() = subtype(LandTypes.Locus)
val ciFactory.Gate : ciCondition get() = subtype(LandTypes.Gate)


// SpellType
val ciFactory.Adventure : ciCondition get() = subtype(SpellTypes.Adventure)
val ciFactory.Arcane : ciCondition get() = subtype(SpellTypes.Arcane)
val ciFactory.Trap : ciCondition get() = subtype(SpellTypes.Trap)


// PlaneswalkerType
val ciFactory.Ajani : ciCondition get() = subtype(PlaneswalkerTypes.Ajani)
val ciFactory.Aminatou : ciCondition get() = subtype(PlaneswalkerTypes.Aminatou)
val ciFactory.Angrath : ciCondition get() = subtype(PlaneswalkerTypes.Angrath)
val ciFactory.Arlinn : ciCondition get() = subtype(PlaneswalkerTypes.Arlinn)
val ciFactory.Ashiok : ciCondition get() = subtype(PlaneswalkerTypes.Ashiok)
val ciFactory.Bolas : ciCondition get() = subtype(PlaneswalkerTypes.Bolas)
val ciFactory.Chandra : ciCondition get() = subtype(PlaneswalkerTypes.Chandra)
val ciFactory.Dack : ciCondition get() = subtype(PlaneswalkerTypes.Dack)
val ciFactory.Daretti : ciCondition get() = subtype(PlaneswalkerTypes.Daretti)
val ciFactory.Davriel : ciCondition get() = subtype(PlaneswalkerTypes.Davriel)
val ciFactory.Domri : ciCondition get() = subtype(PlaneswalkerTypes.Domri)
val ciFactory.Dovin : ciCondition get() = subtype(PlaneswalkerTypes.Dovin)
val ciFactory.Elspeth : ciCondition get() = subtype(PlaneswalkerTypes.Elspeth)
val ciFactory.Estrid : ciCondition get() = subtype(PlaneswalkerTypes.Estrid)
val ciFactory.Freyalise : ciCondition get() = subtype(PlaneswalkerTypes.Freyalise)
val ciFactory.Garruk : ciCondition get() = subtype(PlaneswalkerTypes.Garruk)
val ciFactory.Gideon : ciCondition get() = subtype(PlaneswalkerTypes.Gideon)
val ciFactory.Huatli : ciCondition get() = subtype(PlaneswalkerTypes.Huatli)
val ciFactory.Jace : ciCondition get() = subtype(PlaneswalkerTypes.Jace)
val ciFactory.Jaya : ciCondition get() = subtype(PlaneswalkerTypes.Jaya)
val ciFactory.Karn : ciCondition get() = subtype(PlaneswalkerTypes.Karn)
val ciFactory.Kasmina : ciCondition get() = subtype(PlaneswalkerTypes.Kasmina)
val ciFactory.Kaya : ciCondition get() = subtype(PlaneswalkerTypes.Kaya)
val ciFactory.Kiora : ciCondition get() = subtype(PlaneswalkerTypes.Kiora)
val ciFactory.Koth : ciCondition get() = subtype(PlaneswalkerTypes.Koth)
val ciFactory.Liliana : ciCondition get() = subtype(PlaneswalkerTypes.Liliana)
val ciFactory.Nahiri : ciCondition get() = subtype(PlaneswalkerTypes.Nahiri)
val ciFactory.Narset : ciCondition get() = subtype(PlaneswalkerTypes.Narset)
val ciFactory.Nissa : ciCondition get() = subtype(PlaneswalkerTypes.Nissa)
val ciFactory.Nixilis : ciCondition get() = subtype(PlaneswalkerTypes.Nixilis)
val ciFactory.Oko : ciCondition get() = subtype(PlaneswalkerTypes.Oko)
val ciFactory.Ral : ciCondition get() = subtype(PlaneswalkerTypes.Ral)
val ciFactory.Rowan : ciCondition get() = subtype(PlaneswalkerTypes.Rowan)
val ciFactory.Saheeli : ciCondition get() = subtype(PlaneswalkerTypes.Saheeli)
val ciFactory.Samut : ciCondition get() = subtype(PlaneswalkerTypes.Samut)
val ciFactory.Sarkhan : ciCondition get() = subtype(PlaneswalkerTypes.Sarkhan)
val ciFactory.Serra : ciCondition get() = subtype(PlaneswalkerTypes.Serra)
val ciFactory.Sorin : ciCondition get() = subtype(PlaneswalkerTypes.Sorin)
val ciFactory.Tamiyo : ciCondition get() = subtype(PlaneswalkerTypes.Tamiyo)
val ciFactory.Teferi : ciCondition get() = subtype(PlaneswalkerTypes.Teferi)
val ciFactory.Teyo : ciCondition get() = subtype(PlaneswalkerTypes.Teyo)
val ciFactory.Tezzeret : ciCondition get() = subtype(PlaneswalkerTypes.Tezzeret)
val ciFactory.Tibalt : ciCondition get() = subtype(PlaneswalkerTypes.Tibalt)
val ciFactory.Ugin : ciCondition get() = subtype(PlaneswalkerTypes.Ugin)
val ciFactory.Venser : ciCondition get() = subtype(PlaneswalkerTypes.Venser)
val ciFactory.Vivien : ciCondition get() = subtype(PlaneswalkerTypes.Vivien)
val ciFactory.Vraska : ciCondition get() = subtype(PlaneswalkerTypes.Vraska)
val ciFactory.Will : ciCondition get() = subtype(PlaneswalkerTypes.Will)
val ciFactory.Windgrace : ciCondition get() = subtype(PlaneswalkerTypes.Windgrace)
val ciFactory.Wrenn : ciCondition get() = subtype(PlaneswalkerTypes.Wrenn)
val ciFactory.Xenagos : ciCondition get() = subtype(PlaneswalkerTypes.Xenagos)
val ciFactory.Yanggu : ciCondition get() = subtype(PlaneswalkerTypes.Yanggu)
val ciFactory.Yanling : ciCondition get() = subtype(PlaneswalkerTypes.Yanling)
val ciFactory.Basri : ciCondition get() = subtype(PlaneswalkerTypes.Basri)
val ciFactory.Lukka : ciCondition get() = subtype(PlaneswalkerTypes.Lukka)
val ciFactory.Calix : ciCondition get() = subtype(PlaneswalkerTypes.Calix)


// CreatureType
val ciFactory.Advisor : ciCondition get() = subtype(CreatureTypes.Advisor)
val ciFactory.Aetherborn : ciCondition get() = subtype(CreatureTypes.Aetherborn)
val ciFactory.Ally : ciCondition get() = subtype(CreatureTypes.Ally)
val ciFactory.Angel : ciCondition get() = subtype(CreatureTypes.Angel)
val ciFactory.Antelope : ciCondition get() = subtype(CreatureTypes.Antelope)
val ciFactory.Ape : ciCondition get() = subtype(CreatureTypes.Ape)
val ciFactory.Archer : ciCondition get() = subtype(CreatureTypes.Archer)
val ciFactory.Archon : ciCondition get() = subtype(CreatureTypes.Archon)
val ciFactory.Army : ciCondition get() = subtype(CreatureTypes.Army)
val ciFactory.Artificer : ciCondition get() = subtype(CreatureTypes.Artificer)
val ciFactory.Assassin : ciCondition get() = subtype(CreatureTypes.Assassin)
val ciFactory.AssemblyWorker : ciCondition get() = subtype(CreatureTypes.AssemblyWorker)
val ciFactory.Atog : ciCondition get() = subtype(CreatureTypes.Atog)
val ciFactory.Aurochs : ciCondition get() = subtype(CreatureTypes.Aurochs)
val ciFactory.Avatar : ciCondition get() = subtype(CreatureTypes.Avatar)
val ciFactory.Azra : ciCondition get() = subtype(CreatureTypes.Azra)
val ciFactory.Badger : ciCondition get() = subtype(CreatureTypes.Badger)
val ciFactory.Barbarian : ciCondition get() = subtype(CreatureTypes.Barbarian)
val ciFactory.Basilisk : ciCondition get() = subtype(CreatureTypes.Basilisk)
val ciFactory.Bat : ciCondition get() = subtype(CreatureTypes.Bat)
val ciFactory.Bear : ciCondition get() = subtype(CreatureTypes.Bear)
val ciFactory.Beast : ciCondition get() = subtype(CreatureTypes.Beast)
val ciFactory.Beeble : ciCondition get() = subtype(CreatureTypes.Beeble)
val ciFactory.Berserker : ciCondition get() = subtype(CreatureTypes.Berserker)
val ciFactory.Bird : ciCondition get() = subtype(CreatureTypes.Bird)
val ciFactory.Blinkmoth : ciCondition get() = subtype(CreatureTypes.Blinkmoth)
val ciFactory.Boar : ciCondition get() = subtype(CreatureTypes.Boar)
val ciFactory.Bringer : ciCondition get() = subtype(CreatureTypes.Bringer)
val ciFactory.Brushwagg : ciCondition get() = subtype(CreatureTypes.Brushwagg)
val ciFactory.Camarid : ciCondition get() = subtype(CreatureTypes.Camarid)
val ciFactory.Camel : ciCondition get() = subtype(CreatureTypes.Camel)
val ciFactory.Caribou : ciCondition get() = subtype(CreatureTypes.Caribou)
val ciFactory.Carrier : ciCondition get() = subtype(CreatureTypes.Carrier)
val ciFactory.Cat : ciCondition get() = subtype(CreatureTypes.Cat)
val ciFactory.Centaur : ciCondition get() = subtype(CreatureTypes.Centaur)
val ciFactory.Cephalid : ciCondition get() = subtype(CreatureTypes.Cephalid)
val ciFactory.Chimera : ciCondition get() = subtype(CreatureTypes.Chimera)
val ciFactory.Citizen : ciCondition get() = subtype(CreatureTypes.Citizen)
val ciFactory.Cleric : ciCondition get() = subtype(CreatureTypes.Cleric)
val ciFactory.Cockatrice : ciCondition get() = subtype(CreatureTypes.Cockatrice)
val ciFactory.Construct : ciCondition get() = subtype(CreatureTypes.Construct)
val ciFactory.Coward : ciCondition get() = subtype(CreatureTypes.Coward)
val ciFactory.Crab : ciCondition get() = subtype(CreatureTypes.Crab)
val ciFactory.Crocodile : ciCondition get() = subtype(CreatureTypes.Crocodile)
val ciFactory.Cyclops : ciCondition get() = subtype(CreatureTypes.Cyclops)
val ciFactory.Dauthi : ciCondition get() = subtype(CreatureTypes.Dauthi)
val ciFactory.Demigod : ciCondition get() = subtype(CreatureTypes.Demigod)
val ciFactory.Demon : ciCondition get() = subtype(CreatureTypes.Demon)
val ciFactory.Deserter : ciCondition get() = subtype(CreatureTypes.Deserter)
val ciFactory.Devil : ciCondition get() = subtype(CreatureTypes.Devil)
val ciFactory.Dinosaur : ciCondition get() = subtype(CreatureTypes.Dinosaur)
val ciFactory.Djinn : ciCondition get() = subtype(CreatureTypes.Djinn)
val ciFactory.Dog : ciCondition get() = subtype(CreatureTypes.Dog)
val ciFactory.Dragon : ciCondition get() = subtype(CreatureTypes.Dragon)
val ciFactory.Drake : ciCondition get() = subtype(CreatureTypes.Drake)
val ciFactory.Dreadnought : ciCondition get() = subtype(CreatureTypes.Dreadnought)
val ciFactory.Drone : ciCondition get() = subtype(CreatureTypes.Drone)
val ciFactory.Druid : ciCondition get() = subtype(CreatureTypes.Druid)
val ciFactory.Dryad : ciCondition get() = subtype(CreatureTypes.Dryad)
val ciFactory.Dwarf : ciCondition get() = subtype(CreatureTypes.Dwarf)
val ciFactory.Efreet : ciCondition get() = subtype(CreatureTypes.Efreet)
val ciFactory.Egg : ciCondition get() = subtype(CreatureTypes.Egg)
val ciFactory.Elder : ciCondition get() = subtype(CreatureTypes.Elder)
val ciFactory.Eldrazi : ciCondition get() = subtype(CreatureTypes.Eldrazi)
val ciFactory.Elemental : ciCondition get() = subtype(CreatureTypes.Elemental)
val ciFactory.Elephant : ciCondition get() = subtype(CreatureTypes.Elephant)
val ciFactory.Elf : ciCondition get() = subtype(CreatureTypes.Elf)
val ciFactory.Elk : ciCondition get() = subtype(CreatureTypes.Elk)
val ciFactory.Eye : ciCondition get() = subtype(CreatureTypes.Eye)
val ciFactory.Faerie : ciCondition get() = subtype(CreatureTypes.Faerie)
val ciFactory.Ferret : ciCondition get() = subtype(CreatureTypes.Ferret)
val ciFactory.Fish : ciCondition get() = subtype(CreatureTypes.Fish)
val ciFactory.Flagbearer : ciCondition get() = subtype(CreatureTypes.Flagbearer)
val ciFactory.Fox : ciCondition get() = subtype(CreatureTypes.Fox)
val ciFactory.Frog : ciCondition get() = subtype(CreatureTypes.Frog)
val ciFactory.Fungus : ciCondition get() = subtype(CreatureTypes.Fungus)
val ciFactory.Gargoyle : ciCondition get() = subtype(CreatureTypes.Gargoyle)
val ciFactory.Germ : ciCondition get() = subtype(CreatureTypes.Germ)
val ciFactory.Giant : ciCondition get() = subtype(CreatureTypes.Giant)
val ciFactory.Gnome : ciCondition get() = subtype(CreatureTypes.Gnome)
val ciFactory.Goat : ciCondition get() = subtype(CreatureTypes.Goat)
val ciFactory.Goblin : ciCondition get() = subtype(CreatureTypes.Goblin)
val ciFactory.God : ciCondition get() = subtype(CreatureTypes.God)
val ciFactory.Golem : ciCondition get() = subtype(CreatureTypes.Golem)
val ciFactory.Gorgon : ciCondition get() = subtype(CreatureTypes.Gorgon)
val ciFactory.Graveborn : ciCondition get() = subtype(CreatureTypes.Graveborn)
val ciFactory.Gremlin : ciCondition get() = subtype(CreatureTypes.Gremlin)
val ciFactory.Griffin : ciCondition get() = subtype(CreatureTypes.Griffin)
val ciFactory.Hag : ciCondition get() = subtype(CreatureTypes.Hag)
val ciFactory.Harpy : ciCondition get() = subtype(CreatureTypes.Harpy)
val ciFactory.Hellion : ciCondition get() = subtype(CreatureTypes.Hellion)
val ciFactory.Hippo : ciCondition get() = subtype(CreatureTypes.Hippo)
val ciFactory.Hippogriff : ciCondition get() = subtype(CreatureTypes.Hippogriff)
val ciFactory.Homarid : ciCondition get() = subtype(CreatureTypes.Homarid)
val ciFactory.Homunculus : ciCondition get() = subtype(CreatureTypes.Homunculus)
val ciFactory.Horror : ciCondition get() = subtype(CreatureTypes.Horror)
val ciFactory.Horse : ciCondition get() = subtype(CreatureTypes.Horse)
val ciFactory.Human : ciCondition get() = subtype(CreatureTypes.Human)
val ciFactory.Hydra : ciCondition get() = subtype(CreatureTypes.Hydra)
val ciFactory.Hyena : ciCondition get() = subtype(CreatureTypes.Hyena)
val ciFactory.Illusion : ciCondition get() = subtype(CreatureTypes.Illusion)
val ciFactory.Imp : ciCondition get() = subtype(CreatureTypes.Imp)
val ciFactory.Incarnation : ciCondition get() = subtype(CreatureTypes.Incarnation)
val ciFactory.Insect : ciCondition get() = subtype(CreatureTypes.Insect)
val ciFactory.Jackal : ciCondition get() = subtype(CreatureTypes.Jackal)
val ciFactory.Jellyfish : ciCondition get() = subtype(CreatureTypes.Jellyfish)
val ciFactory.Juggernaut : ciCondition get() = subtype(CreatureTypes.Juggernaut)
val ciFactory.Kavu : ciCondition get() = subtype(CreatureTypes.Kavu)
val ciFactory.Kirin : ciCondition get() = subtype(CreatureTypes.Kirin)
val ciFactory.Kithkin : ciCondition get() = subtype(CreatureTypes.Kithkin)
val ciFactory.Knight : ciCondition get() = subtype(CreatureTypes.Knight)
val ciFactory.Kobold : ciCondition get() = subtype(CreatureTypes.Kobold)
val ciFactory.Kor : ciCondition get() = subtype(CreatureTypes.Kor)
val ciFactory.Kraken : ciCondition get() = subtype(CreatureTypes.Kraken)
val ciFactory.Lamia : ciCondition get() = subtype(CreatureTypes.Lamia)
val ciFactory.Lammasu : ciCondition get() = subtype(CreatureTypes.Lammasu)
val ciFactory.Leech : ciCondition get() = subtype(CreatureTypes.Leech)
val ciFactory.Leviathan : ciCondition get() = subtype(CreatureTypes.Leviathan)
val ciFactory.Lhurgoyf : ciCondition get() = subtype(CreatureTypes.Lhurgoyf)
val ciFactory.Licid : ciCondition get() = subtype(CreatureTypes.Licid)
val ciFactory.Lizard : ciCondition get() = subtype(CreatureTypes.Lizard)
val ciFactory.Manticore : ciCondition get() = subtype(CreatureTypes.Manticore)
val ciFactory.Masticore : ciCondition get() = subtype(CreatureTypes.Masticore)
val ciFactory.Mercenary : ciCondition get() = subtype(CreatureTypes.Mercenary)
val ciFactory.Merfolk : ciCondition get() = subtype(CreatureTypes.Merfolk)
val ciFactory.Metathran : ciCondition get() = subtype(CreatureTypes.Metathran)
val ciFactory.Minion : ciCondition get() = subtype(CreatureTypes.Minion)
val ciFactory.Minotaur : ciCondition get() = subtype(CreatureTypes.Minotaur)
val ciFactory.Mole : ciCondition get() = subtype(CreatureTypes.Mole)
val ciFactory.Monger : ciCondition get() = subtype(CreatureTypes.Monger)
val ciFactory.Mongoose : ciCondition get() = subtype(CreatureTypes.Mongoose)
val ciFactory.Monk : ciCondition get() = subtype(CreatureTypes.Monk)
val ciFactory.Monkey : ciCondition get() = subtype(CreatureTypes.Monkey)
val ciFactory.Moonfolk : ciCondition get() = subtype(CreatureTypes.Moonfolk)
val ciFactory.Mouse : ciCondition get() = subtype(CreatureTypes.Mouse)
val ciFactory.Mutant : ciCondition get() = subtype(CreatureTypes.Mutant)
val ciFactory.Myr : ciCondition get() = subtype(CreatureTypes.Myr)
val ciFactory.Mystic : ciCondition get() = subtype(CreatureTypes.Mystic)
val ciFactory.Naga : ciCondition get() = subtype(CreatureTypes.Naga)
val ciFactory.Nautilus : ciCondition get() = subtype(CreatureTypes.Nautilus)
val ciFactory.Nephilim : ciCondition get() = subtype(CreatureTypes.Nephilim)
val ciFactory.Nightmare : ciCondition get() = subtype(CreatureTypes.Nightmare)
val ciFactory.Nightstalker : ciCondition get() = subtype(CreatureTypes.Nightstalker)
val ciFactory.Ninja : ciCondition get() = subtype(CreatureTypes.Ninja)
val ciFactory.Noble : ciCondition get() = subtype(CreatureTypes.Noble)
val ciFactory.Noggle : ciCondition get() = subtype(CreatureTypes.Noggle)
val ciFactory.Nomad : ciCondition get() = subtype(CreatureTypes.Nomad)
val ciFactory.Nymph : ciCondition get() = subtype(CreatureTypes.Nymph)
val ciFactory.Octopus : ciCondition get() = subtype(CreatureTypes.Octopus)
val ciFactory.Ogre : ciCondition get() = subtype(CreatureTypes.Ogre)
val ciFactory.Ooze : ciCondition get() = subtype(CreatureTypes.Ooze)
val ciFactory.Orb : ciCondition get() = subtype(CreatureTypes.Orb)
val ciFactory.Orc : ciCondition get() = subtype(CreatureTypes.Orc)
val ciFactory.Orgg : ciCondition get() = subtype(CreatureTypes.Orgg)
val ciFactory.Otter : ciCondition get() = subtype(CreatureTypes.Otter)
val ciFactory.Ouphe : ciCondition get() = subtype(CreatureTypes.Ouphe)
val ciFactory.Ox : ciCondition get() = subtype(CreatureTypes.Ox)
val ciFactory.Oyster : ciCondition get() = subtype(CreatureTypes.Oyster)
val ciFactory.Pangolin : ciCondition get() = subtype(CreatureTypes.Pangolin)
val ciFactory.Peasant : ciCondition get() = subtype(CreatureTypes.Peasant)
val ciFactory.Pegasus : ciCondition get() = subtype(CreatureTypes.Pegasus)
val ciFactory.Pentavite : ciCondition get() = subtype(CreatureTypes.Pentavite)
val ciFactory.Pest : ciCondition get() = subtype(CreatureTypes.Pest)
val ciFactory.Phelddagrif : ciCondition get() = subtype(CreatureTypes.Phelddagrif)
val ciFactory.Phoenix : ciCondition get() = subtype(CreatureTypes.Phoenix)
val ciFactory.Pilot : ciCondition get() = subtype(CreatureTypes.Pilot)
val ciFactory.Pincher : ciCondition get() = subtype(CreatureTypes.Pincher)
val ciFactory.Pirate : ciCondition get() = subtype(CreatureTypes.Pirate)
val ciFactory.Plant : ciCondition get() = subtype(CreatureTypes.Plant)
val ciFactory.Praetor : ciCondition get() = subtype(CreatureTypes.Praetor)
val ciFactory.Prism : ciCondition get() = subtype(CreatureTypes.Prism)
val ciFactory.Processor : ciCondition get() = subtype(CreatureTypes.Processor)
val ciFactory.Rabbit : ciCondition get() = subtype(CreatureTypes.Rabbit)
val ciFactory.Rat : ciCondition get() = subtype(CreatureTypes.Rat)
val ciFactory.Rebel : ciCondition get() = subtype(CreatureTypes.Rebel)
val ciFactory.Reflection : ciCondition get() = subtype(CreatureTypes.Reflection)
val ciFactory.Rhino : ciCondition get() = subtype(CreatureTypes.Rhino)
val ciFactory.Rigger : ciCondition get() = subtype(CreatureTypes.Rigger)
val ciFactory.Rogue : ciCondition get() = subtype(CreatureTypes.Rogue)
val ciFactory.Sable : ciCondition get() = subtype(CreatureTypes.Sable)
val ciFactory.Salamander : ciCondition get() = subtype(CreatureTypes.Salamander)
val ciFactory.Samurai : ciCondition get() = subtype(CreatureTypes.Samurai)
val ciFactory.Sand : ciCondition get() = subtype(CreatureTypes.Sand)
val ciFactory.Saproling : ciCondition get() = subtype(CreatureTypes.Saproling)
val ciFactory.Satyr : ciCondition get() = subtype(CreatureTypes.Satyr)
val ciFactory.Scarecrow : ciCondition get() = subtype(CreatureTypes.Scarecrow)
val ciFactory.Scion : ciCondition get() = subtype(CreatureTypes.Scion)
val ciFactory.Scorpion : ciCondition get() = subtype(CreatureTypes.Scorpion)
val ciFactory.Scout : ciCondition get() = subtype(CreatureTypes.Scout)
val ciFactory.Sculpture : ciCondition get() = subtype(CreatureTypes.Sculpture)
val ciFactory.Serf : ciCondition get() = subtype(CreatureTypes.Serf)
val ciFactory.Serpent : ciCondition get() = subtype(CreatureTypes.Serpent)
val ciFactory.Servo : ciCondition get() = subtype(CreatureTypes.Servo)
val ciFactory.Shade : ciCondition get() = subtype(CreatureTypes.Shade)
val ciFactory.Shaman : ciCondition get() = subtype(CreatureTypes.Shaman)
val ciFactory.Shapeshifter : ciCondition get() = subtype(CreatureTypes.Shapeshifter)
val ciFactory.Shark : ciCondition get() = subtype(CreatureTypes.Shark)
val ciFactory.Sheep : ciCondition get() = subtype(CreatureTypes.Sheep)
val ciFactory.Siren : ciCondition get() = subtype(CreatureTypes.Siren)
val ciFactory.Skeleton : ciCondition get() = subtype(CreatureTypes.Skeleton)
val ciFactory.Slith : ciCondition get() = subtype(CreatureTypes.Slith)
val ciFactory.Sliver : ciCondition get() = subtype(CreatureTypes.Sliver)
val ciFactory.Slug : ciCondition get() = subtype(CreatureTypes.Slug)
val ciFactory.Snake : ciCondition get() = subtype(CreatureTypes.Snake)
val ciFactory.Soldier : ciCondition get() = subtype(CreatureTypes.Soldier)
val ciFactory.Soltari : ciCondition get() = subtype(CreatureTypes.Soltari)
val ciFactory.Spawn : ciCondition get() = subtype(CreatureTypes.Spawn)
val ciFactory.Specter : ciCondition get() = subtype(CreatureTypes.Specter)
val ciFactory.Spellshaper : ciCondition get() = subtype(CreatureTypes.Spellshaper)
val ciFactory.Sphinx : ciCondition get() = subtype(CreatureTypes.Sphinx)
val ciFactory.Spider : ciCondition get() = subtype(CreatureTypes.Spider)
val ciFactory.Spike : ciCondition get() = subtype(CreatureTypes.Spike)
val ciFactory.Spirit : ciCondition get() = subtype(CreatureTypes.Spirit)
val ciFactory.Splinter : ciCondition get() = subtype(CreatureTypes.Splinter)
val ciFactory.Sponge : ciCondition get() = subtype(CreatureTypes.Sponge)
val ciFactory.Squid : ciCondition get() = subtype(CreatureTypes.Squid)
val ciFactory.Squirrel : ciCondition get() = subtype(CreatureTypes.Squirrel)
val ciFactory.Starfish : ciCondition get() = subtype(CreatureTypes.Starfish)
val ciFactory.Surrakar : ciCondition get() = subtype(CreatureTypes.Surrakar)
val ciFactory.Survivor : ciCondition get() = subtype(CreatureTypes.Survivor)
val ciFactory.Tentacle : ciCondition get() = subtype(CreatureTypes.Tentacle)
val ciFactory.Tetravite : ciCondition get() = subtype(CreatureTypes.Tetravite)
val ciFactory.Thalakos : ciCondition get() = subtype(CreatureTypes.Thalakos)
val ciFactory.Thopter : ciCondition get() = subtype(CreatureTypes.Thopter)
val ciFactory.Thrull : ciCondition get() = subtype(CreatureTypes.Thrull)
val ciFactory.Treefolk : ciCondition get() = subtype(CreatureTypes.Treefolk)
val ciFactory.Trilobite : ciCondition get() = subtype(CreatureTypes.Trilobite)
val ciFactory.Triskelavite : ciCondition get() = subtype(CreatureTypes.Triskelavite)
val ciFactory.Troll : ciCondition get() = subtype(CreatureTypes.Troll)
val ciFactory.Turtle : ciCondition get() = subtype(CreatureTypes.Turtle)
val ciFactory.Unicorn : ciCondition get() = subtype(CreatureTypes.Unicorn)
val ciFactory.Vampire : ciCondition get() = subtype(CreatureTypes.Vampire)
val ciFactory.Vedalken : ciCondition get() = subtype(CreatureTypes.Vedalken)
val ciFactory.Viashino : ciCondition get() = subtype(CreatureTypes.Viashino)
val ciFactory.Volver : ciCondition get() = subtype(CreatureTypes.Volver)
val ciFactory.Wall : ciCondition get() = subtype(CreatureTypes.Wall)
val ciFactory.Warlock : ciCondition get() = subtype(CreatureTypes.Warlock)
val ciFactory.Warrior : ciCondition get() = subtype(CreatureTypes.Warrior)
val ciFactory.Weird : ciCondition get() = subtype(CreatureTypes.Weird)
val ciFactory.Werewolf : ciCondition get() = subtype(CreatureTypes.Werewolf)
val ciFactory.Whale : ciCondition get() = subtype(CreatureTypes.Whale)
val ciFactory.Wizard : ciCondition get() = subtype(CreatureTypes.Wizard)
val ciFactory.Wolf : ciCondition get() = subtype(CreatureTypes.Wolf)
val ciFactory.Wolverine : ciCondition get() = subtype(CreatureTypes.Wolverine)
val ciFactory.Wombat : ciCondition get() = subtype(CreatureTypes.Wombat)
val ciFactory.Worm : ciCondition get() = subtype(CreatureTypes.Worm)
val ciFactory.Wraith : ciCondition get() = subtype(CreatureTypes.Wraith)
val ciFactory.Wurm : ciCondition get() = subtype(CreatureTypes.Wurm)
val ciFactory.Yeti : ciCondition get() = subtype(CreatureTypes.Yeti)
val ciFactory.Zombie : ciCondition get() = subtype(CreatureTypes.Zombie)
val ciFactory.Zubera : ciCondition get() = subtype(CreatureTypes.Zubera)


// PlaneType
val ciFactory.Alara : ciCondition get() = subtype(PlaneTypes.Alara)
val ciFactory.Arkhos : ciCondition get() = subtype(PlaneTypes.Arkhos)
val ciFactory.Azgol : ciCondition get() = subtype(PlaneTypes.Azgol)
val ciFactory.Belenon : ciCondition get() = subtype(PlaneTypes.Belenon)
val ciFactory.BolassMeditationRealm : ciCondition get() = subtype(PlaneTypes.BolassMeditationRealm)
val ciFactory.Dominaria : ciCondition get() = subtype(PlaneTypes.Dominaria)
val ciFactory.Equilor : ciCondition get() = subtype(PlaneTypes.Equilor)
val ciFactory.Ergamon : ciCondition get() = subtype(PlaneTypes.Ergamon)
val ciFactory.Fabacin : ciCondition get() = subtype(PlaneTypes.Fabacin)
val ciFactory.Innistrad : ciCondition get() = subtype(PlaneTypes.Innistrad)
val ciFactory.Iquatana : ciCondition get() = subtype(PlaneTypes.Iquatana)
val ciFactory.Ir : ciCondition get() = subtype(PlaneTypes.Ir)
val ciFactory.Kaldheim : ciCondition get() = subtype(PlaneTypes.Kaldheim)
val ciFactory.Kamigawa : ciCondition get() = subtype(PlaneTypes.Kamigawa)
val ciFactory.Karsus : ciCondition get() = subtype(PlaneTypes.Karsus)
val ciFactory.Kephalai : ciCondition get() = subtype(PlaneTypes.Kephalai)
val ciFactory.Kinshala : ciCondition get() = subtype(PlaneTypes.Kinshala)
val ciFactory.Kolbahan : ciCondition get() = subtype(PlaneTypes.Kolbahan)
val ciFactory.Kyneth : ciCondition get() = subtype(PlaneTypes.Kyneth)
val ciFactory.Lorwyn : ciCondition get() = subtype(PlaneTypes.Lorwyn)
val ciFactory.Luvion : ciCondition get() = subtype(PlaneTypes.Luvion)
val ciFactory.Mercadia : ciCondition get() = subtype(PlaneTypes.Mercadia)
val ciFactory.Mirrodin : ciCondition get() = subtype(PlaneTypes.Mirrodin)
val ciFactory.Moag : ciCondition get() = subtype(PlaneTypes.Moag)
val ciFactory.Mongseng : ciCondition get() = subtype(PlaneTypes.Mongseng)
val ciFactory.Muraganda : ciCondition get() = subtype(PlaneTypes.Muraganda)
val ciFactory.NewPhyrexia : ciCondition get() = subtype(PlaneTypes.NewPhyrexia)
val ciFactory.Phyrexia : ciCondition get() = subtype(PlaneTypes.Phyrexia)
val ciFactory.Pyrulea : ciCondition get() = subtype(PlaneTypes.Pyrulea)
val ciFactory.Rabiah : ciCondition get() = subtype(PlaneTypes.Rabiah)
val ciFactory.Rath : ciCondition get() = subtype(PlaneTypes.Rath)
val ciFactory.Ravnica : ciCondition get() = subtype(PlaneTypes.Ravnica)
val ciFactory.Regatha : ciCondition get() = subtype(PlaneTypes.Regatha)
val ciFactory.Segovia : ciCondition get() = subtype(PlaneTypes.Segovia)
val ciFactory.SerrasRealm : ciCondition get() = subtype(PlaneTypes.SerrasRealm)
val ciFactory.Shadowmoor : ciCondition get() = subtype(PlaneTypes.Shadowmoor)
val ciFactory.Shandalar : ciCondition get() = subtype(PlaneTypes.Shandalar)
val ciFactory.Ulgrotha : ciCondition get() = subtype(PlaneTypes.Ulgrotha)
val ciFactory.Valla : ciCondition get() = subtype(PlaneTypes.Valla)
val ciFactory.Vryn : ciCondition get() = subtype(PlaneTypes.Vryn)
val ciFactory.Wildfire : ciCondition get() = subtype(PlaneTypes.Wildfire)
val ciFactory.Xerex : ciCondition get() = subtype(PlaneTypes.Xerex)
val ciFactory.Zendikar : ciCondition get() = subtype(PlaneTypes.Zendikar)