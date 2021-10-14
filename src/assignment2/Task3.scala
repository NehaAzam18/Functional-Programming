package assignment2

import scala.collection.mutable._
object Task3 {
  def main(args: Array[String]): Unit = {
    val Array1 = Array(1.0,2.0,3.0,4.0)
    val Array2 = Array(2.0,3.0,5.0,4.0)
    val Array3 = new Array[Double](4)
    sum( Array1, Array2)
  }
  def sum(arr1: Array[Double], arr2: Array[Double]): ArraySeq[Double] = {
    var maping = (arr1,arr2).zipped.map(_+_)
    println(maping.toSeq)
    maping
  }

}
