// I decided to make it from scratch instead of using the function in P10, to make concepts more intuitive. 
def encodeModified[A](l: List[A]): List[(Int, A) | A] = {
    if (l.isEmpty) return List()
    else {
        val (pack, remain) = l span { _ == l.head }
        if (pack.length == 1) l.head :: encodeModified(remain)
        else (pack.length, l.head) :: encodeModified(remain)
    }
}

@main def P11 = {
    println(encodeModified(List(1,1,1,1,2,3,3,4,5,5,5,5)))
    println(encodeModified(List()))
}