// Reverse a list.

def reverse_1[A](l: List[A]): List[A] = l match {
    case h :: t => reverse_1(t) :+ h
    case Nil => l
}


@main def P05() = {
    println(reverse_1(List(1,2,3,4,5)))
    println(reverse_1(List(1)))
    println(reverse_1(List()))
}