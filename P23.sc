import scala.util.Random

def randomSelect[T](n: Int, l: List[T]) : List[T] = {
  if (n == 0) return List()
  val toRemoveIdx: Int = util.Random.nextInt(l.length)
  val item: T = l(toRemoveIdx)
  item :: randomSelect[T](n-1, removeFrom(toRemoveIdx, l))
}

def removeFrom[T](pos: Int, l: List[T]): List[T] = {
  l.zipWithIndex.filter(x => x._2 != pos).map(_._1)
}

println(randomSelect[String](3, List("a", "b", "c", "d", "f", "g", "h")))
