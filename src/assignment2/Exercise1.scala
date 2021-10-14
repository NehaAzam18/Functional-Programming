package assignment2

object Exercise1 {
  def main(args : Array[String]) = {
    //first method
    var arr = new Array[String](4)
    arr(0) = "a"
    arr(1) = "b"
    arr(2) = "c"
    arr(3) = "d"
    println(("array 1: "))
    for (m <-arr){
      println(m)
    }
    // second method
    var arr2 = Array(1, 2, 3)
    println(("array 2: "))
    for (m <-arr2){
      println(m)
    }
    //appending 1 elements
    var a = arr2 :+ 4
    println(("after updating array 2: "))
    for (m <-a){
      println(m)
    }
    //append 2 elements
    var b = a ++ Array(5,6)
    println(("after updating array 2: "))
    for (m <-b){
      println(m)
    }

    //third method
    var list3= Array.range(1,10)
    for(i<-0 until 10){
      println("i is: " ,i);
    }

  }

}
