// O(n), as tail is O(1)
def duplicate[A](l: List[A]): List[A] = {
    if (l.isEmpty) return List()
    else l.head :: l.head :: duplicate(l.tail)
}

// Funny solution. 
def duplicate_1[A](l: List[A]): List[A] = { 
    l flatMap {e => List(e,e)}
} 

@main def P14() = {
    println(duplicate(List(1,2,3,4,4)))
    println(duplicate(List(1,2)))
}