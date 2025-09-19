def pack[A](l: List[A]): List[List[A]] = {
    l.foldRight(List.empty[List[A]]){
        (x, acc) => (x, acc) match
            case(a, List())  => List(a) :: acc
            case _ => if acc.head(0) == x then (x :: acc.head) :: acc.tail else List(x) :: acc
    }.toList
}

// solution proposed by the website.
def pack_1[A](l: List[A]): List[List[A]] = {
    if (l.isEmpty) List(List())
    else {
        val (packed, next) = l.span{ _ == l.head}
        if (next == Nil) List(packed)
        else packed :: pack_1(next)
    }
}

@main def P09 = {
    println(pack_1(List(1,1,2,3,4,5,5)))
    println(pack_1(List()))
}