def duplicateN[A](n: Int, l: List[A]) : List[A] = {
    if (l.isEmpty) List()
    else List.fill(n)(l.head) ::: duplicateN(n, l.tail)
}

def duplicateN_1[A](n: Int, l: List[A]) : List[A] = { 
    l flatMap { e => List.fill(n)(e)} 
}

@main def P15() = {
    println(duplicateN(3, List(1,2,3,4))) 
    println(duplicateN(2, List(1)))
    println(duplicateN(3, List()))
}