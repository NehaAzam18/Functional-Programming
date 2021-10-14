package assignment3

import scala.collection.mutable.ArrayBuffer

object Exercise2_1 {
  def main(args: Array[String]): Unit = {
    //shallow copy
    var obj = info("neha", "azam",ArrayBuffer("pink","red","blue"))
    var obj2 = obj.copy()
    obj.fav_color.remove(1)
    println("object1", obj)
    println("object2", obj2)
//var obj3 = second_info("neha", "azam",ArrayBuffer("pink","red","blue"))
//    var obj4 = obj.copy()
//    obj3.fav.remove(1)
//    println("object1", obj3)
//    println("object2", obj4)
//
  }
}
case class info(fname:String, lname:String, fav_color :ArrayBuffer[String])

//class second_info(fnam:String, lnam:String, fav :ArrayBuffer[String])
