// Different numbers 

def randomSelect[T](n: Int, l: List[T]) : List[T] = {
  if (n == 0) return List()
  val toRemoveIdx: Int = util.Random.nextInt(l.length)
  val item: T = l(toRemoveIdx)
  item :: randomSelect[T](n-1, removeFrom(toRemoveIdx, l))
}

def removeFrom[T](pos: Int, l: List[T]): List[T] = {
  l.zipWithIndex.filter(x => x._2 != pos).map(_._1)
}

def lotto(n: Int, untilN: Int) : List[Int] = {
  randomSelect(n, (1 to untilN).toList)
}

println(lotto(6, 49))
// res0: List[Int] = List(23, 1, 17, 33, 21, 37)
