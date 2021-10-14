package assignment3
//import assignment3.Exercise1_3
import scala.language.implicitConversions

object Excercise1_3 {
  implicit var arg = 123

  def fun(implicit intTOList:Int):List[Int] = List(intTOList)

  def main(args:Array[String]): Unit = {
    println(fun)
  }
}

//case class Exercise1_3(s: String)
//object Exercise1_3 {
//    // Using implicitConversions
//    implicit def fromString(s: String): Exercise1_3 = Exercise1_3(s)
//  }
//  class C {
//    def m1(a: Exercise1_3) = println(a)
//    def m(s: String) = m1(s)
//  }
//  // Creating object
//  object C {
//    // Main method
//    def main(args: Array[String]) {
//      var b : Exercise1_3 = ("neha")
//      println(b)
//    }
//  }


