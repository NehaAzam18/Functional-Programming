package assignment3

import assignment3.Exercise1_1.ListCreate

import scala.collection.mutable.ListBuffer
import scala.util.control.Breaks.break

object Exercise1_1 extends Enumeration {
  var ListCreate = new ListBuffer[Int]()
  val a = 2
  val b = 3
  var l1 = "addition"
  var l2 = "multiplication"
  var l3 = "addition of l1 & l2"
  var ex = "exit"

  def main(args: Array[String]): Unit = {
    val obj = new Exercise1_1()
  }
}

class Exercise1_1{
  var state = Exercise1_1.l1
  while(true){
    state match{
      case("addition")=>{
        Exercise1_1.ListCreate+= (Exercise1_1.a + Exercise1_1.b)
        println(ListCreate)
        state = Exercise1_1.l2
      }
      case("multiplication")=>{
        Exercise1_1.ListCreate += (Exercise1_1.a * Exercise1_1.b)
        println(ListCreate)
        state = Exercise1_1.l3
      }
      case("addition of l1 & l2")=>{
        Exercise1_1.ListCreate += ((Exercise1_1.a / Exercise1_1.b))
        println(ListCreate)
        state = Exercise1_1.ex
      }
      case("exit") => break
    }

  }
}
