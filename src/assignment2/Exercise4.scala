package assignment2

object Exercise4 {
  def main( args :Array[String]) :Unit = {
    val aaa = Array(1, 2, 3)
    //  println(HOF("HOF of Array", arrayCal(aaa)))}
    println(arrayCal(aaa))
    //    println(HOF("Talha",a => a))
  }
  def arrayCal(x : Array[Int]): (Int,Int) ={
    val sum = x.reduce(_ + _)
    //sum
    val h = x.head
    (h , sum)
//    val t = x.tail
//    t
    }

  def HOF(name : String, f : Int => Int)={
    val msg = " The %s is %d"
    msg.format(name, f)
  }

}
