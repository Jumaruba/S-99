// Solution 1: Find the last element of a list.
def last[A](list: List[A]): A = list.last;

// Solution 2:
def last2[A](list: List[A]): A = list match {
    case head :: Nil => head
    case _ :: tail => last2(tail)
    case _ => throw new NoSuchElementException
}


@main def P01(): Unit = {
    println(last2(List(1,2,3,4,5,6)));
    //println(last(List()));
    println(last2(List(1)));
}