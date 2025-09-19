// Find the number of elements of a list.

def length_1[A](l: List[A]): Int = {
    l.length
}

def recursive_length[A](n: Int, l: List[A]) : Int = l match {
    case _ :: t => recursive_length(n+1, t)
    case Nil => n
}

def length_2[A](l: List[A]): Int = recursive_length(0, l);

def length_3[A](l: List[A]): Int = l match {
    case _ :: t => 1 + length_3(t)
    case Nil => 0
}

def length_4[A](l: List[A]): Int = {
    l.foldRight(0){(_, acc) => acc + 1 }
}

@main def P04(): Unit = {
    println(length_4(List(1,2,3,4,5,6)));
    println(length_4(List(1,3)));
    println(length_4(List(1)));
    println(length_4(List()));
}