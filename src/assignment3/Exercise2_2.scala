package assignment3

object Exercise2_2 {
  implicit def sum(arg1:Int, arg2:String):String= arg1 +arg2
  def main(args:Array[String]): Unit = {
    val arg1:Int = 2
    val arg2:String = "neha"
    println(sum(arg1,arg2))
  }

}
