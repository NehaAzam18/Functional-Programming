package assignment3

import math._
object Exercise3 extends App {
    val vec = Vector(1,2,3,4,5)
    def Ecl_Distance(vec: Vector[Int]) = math.sqrt(vec.map(math.pow(_,2)).reduce(_+_))
    println(Ecl_Distance(vec).toFloat)
}
