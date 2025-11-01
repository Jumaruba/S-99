def range(s: Int, e: Int): List[Int] = {
  if (s == e) return List(e)
  else s :: range(s+1, e)
}

val l: List[Int] = range(4,9)
println(range(4, 9))
