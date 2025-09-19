def compress[A](l: List[A]): List[A] = {
    if (l.isEmpty) {
        return l
    }
    // Starts with the empty.
    return l.foldRight(List.empty[A]) { (curr, acc) => 
        if (acc.isEmpty || acc.head != curr) curr :: acc
        else acc 
    }

}

@main def P08 = {
    val l = List(1,1,1,2,3,4,5,1,1)
    println(compress(l))
}