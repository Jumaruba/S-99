def decode[A](l: List[(Int, A)]): List[A] = {
    if (l.isEmpty) List()
    else List.fill(l.head._1)(l.head._2) ::: decode(l.tail)
}

def decode_1[A](l: List[(Int, A)]): List[A] = {
    if (l.isEmpty) List()
    else l flatMap {e => List.fill(e._1)(e._2)}
}

@main def P12 = {
    println(decode(List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))))
}