package assignment2

object Task4 {
  def main( args :Array[String]) :Unit = {
    val arr:Array[Int] = Array.fill(100)(util.Random.nextInt(100))
    //val arr = Array(1,2,6,5,8,6,8)
//    println((List(arr)))
    println(checkNumber(arr))
  }
  def checkNumber(n :Array[Int]) : List[Int] = {
    def go(n : Array[Int],s : Int, acc : List[Int]): List[Int]= {
      if (s >= n.size) acc
      else {
        if(n(s) % 2 == 0) (go(n, s + 1,  acc ::: List(n(s))))
        else go(n, s+1, List(n(s)))
      }
    }
    go(n,s = 0 :Int, List())
  }
//  def HOF(name : String, f : Array[Int] => List[Int])={
//    val msg = " The %s is %d"
//    msg.format(name, f)
//  }

}
