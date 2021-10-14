package assignment2
import scala.collection.mutable.Map
import scala.util.Random

//object Exercise3 {
//  def main(args: Array[String]): Unit = {
////    val op = show(Some(3))
////    println(op.get)
//    val gett = fun(Some("a"))
//    println(gett.get)
//
//  }
//  def fun(a : Option[String]):String = {
//    //val ran = a.isInstanceOf[String]
//    val str = "String"
//    if(a.isInstanceOf[String]){
//      str
//    }
//    else{
//      "false"
//    }
//  }

//  def opType(param: Option[Int]) = {
//    param match {
//      case 1 => Some(1)
////      case 2 => "hania"
////      case 3 => "kitty"
//      case _ => Nil
//    }
//    if (param.isDefined) param
//    else None
  //}

  //  }
  //    def show(x: Option[Int])= {
  //      val collection = Map(1 -> "a", 2 -> "b", 4 -> "c")
  //      //println(collection.get(Some(x)))
  //      if (collection.contains(x)):Boolean
  //      else{
  //        None
  //      }
  //    }
object Exercise3 {
  def main(args:Array[String]): Unit ={
    //val a = Array["a","b","c"]
//    val op = opType(Some(1))
//    println(op.get)
  //}
   val name = Map("neha" -> "Student",
  "hani" -> "teacher")
    println(patrn(name.get("neha")))
    println(patrn(name.get("bisma")))
  }

  def patrn(z: Option[String]) = z match
  {
    case Some(s) => (s)
    case None => ("key not found")
  }


}

