package assignment3

object Exercise1_2{
  def main(args: Array[String]) :Unit = {
    val obj = this.apply(Array(1, 2, 3, 4, 5))
    println(obj)
  }

  def apply(arg:Array[Int]):Int = {
    def go(arg:Array[Int], size:Int, acc:Int):Int={
      if(size == 0) acc
      else(go(arg, size-1, acc + arg(size-1) ))
    }
    go(arg,arg.size,0)
  }
//OR
  //def apply(lst:Array[Int]) = lst.reduce(_+_)
}
