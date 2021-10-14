package assignment2
import scala.collection.mutable.Map

object Task5 {
  val lst = Array(1, 2, 3, 4, 5)
  def func:Int => Boolean = x => x % 2 == 0

  def buildMap[A, B](data: Seq[A], f: A => B): Map[A, B] = {
    var result1 = data.map(x => f(x))
    val c = collection.mutable.Map[A, B]()
    var n = data.size
    var i = 0
    for(i<-0 until n){
      c ++= Map(data(i) -> f(data(i)))

    }
    c
  }

  def main(args: Array[String]): Unit= {
    val result = buildMap(lst, func)
    println(result)
  }

}


