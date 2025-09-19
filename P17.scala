// n is the length of the first part.

// The stupid solution. 
def split_1[A](n: Int, l: List[A]) : List[List[A]] = {
    val (left, right) = l splitAt n;
    List(left, right)
}

// The non-stupid solution. If you still thinks it is stupid, that's your problem :) 
def split_2[A](n: Int, l: List[A]) : List[List[A]] = { 
    val left = l take n;
    val right = l drop n;
    return List(left, right)
}

@main def split() = {
    println(split_1(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
    println(split_2(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
    println(split_2(3, List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')))
    
}