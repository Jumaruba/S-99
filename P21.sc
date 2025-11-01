// Insert an element at a given position into a list.
// def insertAt(s: String, pos: Int, l: List[String]): List[String] = {
//  l.slice(0, 1).appended(s) ++ l.slice(1, l.length)
// }


def insertAt(s: String, pos: Int, l: List[String]): List[String] = {
  l.splitAt(pos) match {
    case (l, r) => l ::: s :: l
  }
}
println(insertAt("new", 1, List("a", "b", "c", "d")))
