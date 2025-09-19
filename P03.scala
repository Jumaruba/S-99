def nth_1[A](n: Int, l: List[A]): A = (n, l) match {
    case (0, h :: _) => h
    case (n, _ :: tail) => nth_1(n-1, tail)
    case (_, Nil) => throw new NoSuchElementException
}

def nth_2[A](n: Int, l: List[A]): A  = {
    if (n >= l.length) return throw new NoSuchElementException
    l(n)
}



@main def P03(): Unit = {
    println(nth_1(1, List(1,2,3,4,5,6)));
    println(nth_1(0, List(1,3)));
    //println(nth_1(4, List(1)))
}