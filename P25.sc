// Get a new random position for the List.
def randomPermute[T](s: List[T]): List[T] = {
  if (s.isEmpty) return List()
  val pos = util.Random.nextInt(s.length)
  // The expression inside randomPermute is a list that removes the positions specified.
  s(pos) :: randomPermute(s.zipWithIndex.filter(x => x._2 != pos).map(_._1))
}


println(randomPermute(List("a", "b", "c", "d", "e", "f")))
