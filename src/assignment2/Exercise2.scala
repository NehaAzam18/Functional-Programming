package assignment2
import scala.collection.mutable.Set
import scala.collection.mutable.Map
object Exercise2 {
  def main ( args: Array[String]) : Unit = {
    //mutable set
    var set1 : Set[String] = Set("a","b","c","d")
    var set2 = Set(1, 2, 3, 4)
    println(" mutable set1",set1)
    println(" mutable set2",set2)
    set1.add("e")
    println("set1", set1)
    set2 ++== Set(5,6,7)
    println("set2",set2 )

    //mutable map
    val treasureMap = Map[Int, String]()
    treasureMap += (1 -> "hello")
    treasureMap += (2 -> "hi",3 -> "bye")
    println(treasureMap(1))

  }

}
