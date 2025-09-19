def rotate[A](n: Int, l: List[A]): List[A] = {
    val actual_n = n % l.length; 
    val (first, remainder) = l.zipWithIndex.span { (e, i) => i > n }
    remainder.map((e,i) => e) ::: first.map((e,i) => e)
}


@main def P19 = {
    println(rotate(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
    println(rotate(-2, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}