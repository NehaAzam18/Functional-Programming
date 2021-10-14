package example

import scala.reflect.internal.util.TriState.{False, True}

object MyModule {
  def abs(n :Int) :Int =
    if (n < 0) -n
    else n
  private def formatAbs(x : Int) = {
    val msg = " the absolute value of %d is %d"
    msg.format(x, abs(x))
  }
  def factorial (n: Int) : Int = {
    @annotation.tailrec
    def go(n : Int, acc: Int): Int=
      if (n <= 0) acc
      else go(n-1, n*acc)
    go (n, 1)
  }
  def fib(n: Int) : Int = {
    @annotation.tailrec
    def go( n : Int, value : Int, acc: Int): Int= {
      if ( n == 0) acc
      else {
        go(n - 1, acc, acc + value)
      }}
    go( n, 0, acc = 1)
  }

  def palindrome( n:String) : Boolean= {
    def go(n : String, s : Int, e : Int): Boolean = {
      if (n(s) == n(e)) {true}
      else if (n(s) != n(e)) {false}
      else go(n, n(s+1), n(e-1))
    }
    go (n, s = 0, e = n.length-1)
  }


  def main(args: Array[String]) :Unit = {
    println(abs(-42))
    println(formatAbs(12))
    println(factorial(5))
    println(fib(8))
    println(palindrome("ababa"))
  }

}

