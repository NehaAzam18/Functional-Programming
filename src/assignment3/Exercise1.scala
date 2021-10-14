package assignment3

object Exercise1 extends App {
  val a = 3
  val b = 5
  val c = 7
  def quadratic(x:Int):Int = a* (x*x) + b*x +c
  val aa= List.range(-3, 3)
  val a_map2 = aa.map(x =>quadratic(x))
  println(a_map2)
  }

