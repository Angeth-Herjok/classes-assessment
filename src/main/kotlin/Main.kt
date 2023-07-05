import java.util.StringTokenizer
import java.util.regex.Pattern

fun main() {
var drum=Drum("leather","large")
    drum.makeSound("produces wide range of voice")
    var djembe=Djembe("wood","small")
    djembe.makeSound("makes a wide range of sound")
    var talkingDrum=TalkingDrum("metal","large")
    talkingDrum.makeSound("mimics human speech")
    var bougaraubou=Bougaraubou("plastic","small")
    bougaraubou.makeSound("its deep,rich bas tones.")


    val magicalPowers = mapOf(
        "wet" to "healing",
        "dry" to "strength"
    )
    val fruits = mapOf(
        "wet" to "fruitwithonebud",
        "dry" to "fruitwithtwobuds"
    )
    val baobab = Baobab(magicalPowers, fruits, "wet")
    println(baobab.predictFruit()) // Output: The fruit to be born in the next season is banana with strength power.
    println(baobab.consumeFruit("mango")) // Output: You consumed mango and gained healing power.


    var ankaraFabric=AnkaraFabric(30.00,"happy")
    ankaraFabric.predictDesign("floral")



    var animal=Animal("Elephant","Wild","Location")
    println(animal.prediction("savannah"))
    println("predicted animal is $animal")



    val baobabTree = BaobabTree()

    baobabTree.predictFruitType()

    baobabTree.predictFruitPower()

    baobabTree.recordFruitEffects("Increases strength")
    baobabTree.recordFruitEffects("Increases speed")
    baobabTree.recordFruitEffects("Increases healing")




}
// The Ever-Changing Ankara: You are a fashion designer known for your unique and vibarnt Ankara designs.
// Recently, you've discovered that some of your fabric patterns change their designs based on the
// temperature and mood of the WebGLVertexArrayObject. You want to craete a software application that
// can predict the changes in the fabric design given changing Ankara and how to predict the changes.
//class Fabric(val name: String, val pattern: String, val temperature: Int, val mood: String) {


class AnkaraFabric(var temperature:Double,var mood:String) {
    fun predictDesign(design:String) {
        if((temperature in 10.00..30.00) && (mood == "happy")){
            println("The design pattern changes $design")
        }
        else if(temperature in 30.00..40.00 && mood=="sad"){
            println("The pattern changes $design")
        }
        else{
            println("none")
        }
    }
    }

// The Great Migration Forecast:Every year , millions of wildebeest, zebras, and other animals participae
// in the Great Migration across the Serengeti-Mara ecosystem.As a conservationist, you want to develop
// a software system that models this migartion, predicting the movement of the herds based on weather
// patterns, river levels, and predator locations. Consider what classes you will need to represent the
// animals, the environment, and the various factors that influence the migration.
//class Animal(val name: String, val type: String, val population: Int) {




// Nollywood Movie Planner:As a producer in the booming Nollywood movie industry, you are in charge of
// multiple film projects at once. Each movie has different cast members, shooting schedules, and budgets.
// You want to write a program to help manage your film projects efficiently. The software should be able
// to handle the complexities of sceduling, budgeting and cordinating between different movie projects.
//class MovieProject(val name: String, val cast: List<Actor>, val shootingSchedule: List<ShootingDay>, val budget: Int) {

class Animal(var name:String,var species:String,var location:String) {


    class Environment(var weatherPattern: String, var riverLevel: String, var predatorLocation: String)

    class Migration(var environment: String)
    fun prediction(environment:String){

    }
}

// The Magical Baobab:In a small village, there is a Baobab tree believed to have magical properties.
// Every season, it bears different types of fruits, each with its own unique power. You have decided
// to create a software system that tracks the changes in the tree and predicts what type of fruit
// it will bear next season and what powers it will possess. The system should also record the effect
// of each fruit when consumed.
//class BaobabTree {
//
//    var fruits: MutableList<String> = mutableListOf()
//    var powers: MutableList<String> = mutableListOf()
//
//    fun addFruit(fruit: String, power: String) {
//        fruits.add(fruit)
//        powers.add(power)
//    }
//
//    fun predictFruit(): Pair<String, String> {
//        val fruit = fruits.random()
//        val power = powers.random()
//        return fruit to power
//    }
//
//    fun recordEffect(fruit: String, power: String) {
//        fruits.remove(fruit)
//        powers.remove(power)
//    }
//}

//class BaobabTree {
//    var fruitType: String = ""
//    var fruitPower: String = ""
//    var fruitEffects: Li st<String> = mutableListOf()
//
//    fun predictFruitType() {
//        println("The Baobab tree will bear a fruit of type ${fruitType}.")
//    }
//    fun predictFruitPower() {
//        println("The fruit will have the power of ${fruitPower}.")
//    }
//    fun recordFruitEffects(effect: String) {
////        fruitEffects.add(effect)
//        println("The fruit has the following effects:")
//        for (effect in fruitEffects) {
//            println(effect)
//        }
//    }
//}







class Baobab( val magicalPowers: Map<String, String>, val fruits: Map<String, String>, val season: String) {
    fun predictFruit(): String {
        val nextSeason = getNextSeason(season)
        val predictedFruit = fruits[nextSeason]
        val predictedPower = magicalPowers[nextSeason]
        return if (predictedFruit != null && predictedPower != null) {
            "The fruit to be born in the next season is $predictedFruit with $predictedPower power."
        } else {
            "The fruit to be born in the next season is unknown."
        }
    }
    fun consumeFruit(fruitName: String): String {
        val consumedPower = magicalPowers[fruitName]
        return if (consumedPower != null) {
            "You consumed $fruitName and gained $consumedPower power."
        } else {
            "The fruit you consumed is unknown or not available."
        }
    }
    fun getNextSeason(currentSeason: String): String {
        return if (currentSeason.toLowerCase() == "wet") {
            "dry"
        } else {
            "wet"
        }
    }
}

// The Legendary African Drum Circles: You're part of a community that hosts one of the largest drum
// circles in Africa. There are different types of traditional drums used in the circle, each with its
// unique sound and rythm. The Djembe, Talking Drum, and Bougaraubou are among the popular ones. These
// drums have common properties such as the material they're made from and their sizes, but they also
// have distinct characteristics. For instanceof, the Talking Drum can mimic the lines of human speech,
// the Djembe is known for its wide range of tones, and the Bougaraubou is noted for its deep
// rich bas tones.

// You want to create a software model of the drum circle that encapsulates these different types
// of drums. You wish to include methods for each drum that represent the sound it makes, and also
// group similar drums together. Think about creating a base Drum class that contains properties
// and methods common to all drums common to all drums, and then create subclasses for each specific
// type of drum (like Djembe, TalkingDrum, and Bougaraubou).


// The subclasses should inherit from the base DRum class and also implement their unique characteristics
// .This software model would help newcomers understand the characteristics of each drum and how
// they contribute to the overall rhythm of the drum circle.
open class Drum ( var material: String ,var size: String){

   open fun makeSound(tone:String) {
        println("makes $tone sound")
    }
}

class Djembe(material: String, size: String) : Drum(material, size) {
    override fun makeSound(tone: String) {
       println("makes $tone sound")
    }
}

class TalkingDrum(material: String, size: String) : Drum(material, size) {
    override fun makeSound(tone: String) {
       println("makes $tone sound")
    }
}

class Bougaraubou(material: String, size: String) : Drum(material, size) {
    override fun makeSound(tone: String) {
        println("makes $tone ")
    }
}

