def removeAt[A](k: Int, l: List[A]): List[A] = {
    l.zipWithIndex.filter((e, idx) => idx != k).map((e,_) => e)
}


@main def P20 = {
    println(removeAt(1, List('a', 'b', 'c', 'd')))
}