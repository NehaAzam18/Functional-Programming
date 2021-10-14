//package assignment2
//
//import scala.collection.mutable.ListBuffer
//import scala.util.Random
//
//object Task1 {
//  def main(args: Array[String]): Unit = {
//    //println(randNumber(50, 500))
//    var b:Array[Int] = Array.fill(15){scala.util.Random.between(50, 500)}
//    for(i<-0 until b.length){
//      println(b(i))
//    }
//
//    var i = 0
//    while(i<=0){
//      val isPrime:Int=>Boolean = b => b<=1 || b==2 || !(2 to (b-1)).exists(b % _ == 0)
//      //println(isPrime)
//    }
////    val isPrime:Int=>Boolean = b => b<=1 || b==2 || !(2 to (b-1)).exists(b % _ == 0)
//
////    println(isPrime)
//    //var iter = new ListBuffer[Int]()
//    var it = Iterator()
//    println(it)
////    val iter = b.filter(isPrime).sortWith(_ < _).iterator
////    println(iter)
////    it ++= isPrime
//
//    }
//
//
//
////    def randNumber( s: Int, e: Int) = {
////      var b:Array[Int] = Array.fill(15){scala.util.Random.between(s, e)}
////      //println(b)
////      val isPrime:Int=>Boolean = n => n<=1 || n==2 || !(2 to (n-1)).exists(n % _ == 0)
////
////    }
//
//
//
//    }
//
//
//    //val prime(Int) = (n > 1) && !(2 to scala.math.sqrt(n).toInt).exists(x => n % x == 0)
////    prime
////
////
////
////        for(i <- ran_no) {
////      println(i)
////    }
////    ran_no
////    ran = Random.between(s, e)
////
////
////
