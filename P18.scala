// Extract a slice for a list

def slice[A](i: Int, k: Int, l: List[A]) : List[A]= {
    l.zipWithIndex.filter((e, idx) => {
        idx >= i && idx < k
    }).map((e, idx) => e).toList; 
}

// O(i+k)
// Smallest solution I can think of. 
def slice_1[A](i: Int, k: Int, l: List[A]) : List[A]= { 
    l.drop(i).take(k-i)
}

@main def P18() = {
    println(slice_1(3, 7, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
}