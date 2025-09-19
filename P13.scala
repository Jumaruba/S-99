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