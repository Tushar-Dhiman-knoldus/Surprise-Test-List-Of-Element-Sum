package com.knoldus.listelementsum
import scala.annotation.tailrec

object ListElementSum extends App {

  val list: List[Int] = List(4, 5, 6, 3, 2, 1)

  def sumOfElement(listOfIntegers: List[Int]): Int = {

    @tailrec
    def loop(list: List[Int], sum: Int): Int = list match {
      case Nil => sum
      case head :: tail => loop(tail, sum + head)
    }

    loop(listOfIntegers, 0)
  }
}

