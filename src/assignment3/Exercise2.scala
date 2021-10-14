package assignment3
import scala.collection.immutable
import Exercise1._
object Exercise2 extends App{
  val a = 3
  val b = 5
  val c = 7
  def quadratic(x:Int):Int = a* (x*x) + b*x +c
  val aa= List.range(-3, 3)
  println(aa)
  val a_map2 = aa.map(x =>quadratic(x))
  println(a_map2)

  val list_zip = aa.zip(a_map2)
  println(list_zip)

  val zip_index = list_zip.zipWithIndex
  println(zip_index)

  val ccc = zip_index map {case ((a, b), c) => List(a, b, c)}
  println(ccc)

  val sumOfFunc = ccc.map(_(1)).reduce(_+_)
  val LengthOfList = ccc.map(_(2)).reduce(_ max _)
  println(sumOfFunc/LengthOfList)

}
