package assignment2

object Task2 {
  def main(args:Array[String]): Unit = {
    println(CharArray(97))
  }

  def CharArray ( start : Int ) : List[Char]={
    val app = List()
    @annotation.tailrec
    def go(start : Int, acc : List[Char]): List[Char ]= {
      if (start >= 123) acc
      else go(start + 1, acc ++ List(start.toChar))
    }
    go (98, app)
  }


}
