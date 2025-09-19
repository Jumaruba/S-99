
// This solution is more efficient, but less usable.
def encode[A](l: List[A]) : List[List[Int| A]] = {
    if (l.isEmpty) List(List())
    else {
        val (packed, remain) = l span {_ == l.head}
        // There isn't anything else to be packed.
        if (remain.isEmpty) return List(List(1, l.head))
        // If there are other things to be packed
        else List(packed.length, l.head) :: encode(remain) 
    }
}

// You can also use the solution of the previous problem.
def encode_2[A](l: List[A]): List[(Int, A)] = {
    pack(l) map { e => (e.length, e.head)}
}


@main def P10() = {
    println(encode(List(1,1,2,3,4,5,5)))
    println(encode(List()))
}