import java.rmi.NoSuchObjectException
// Find the last but one element of a list.

def penultimate[A](list: List[A]): A = {
    return list(list.length - 2);
}

def penultimate2[A](list: List[A]): A = {
    return list.init.last;
}

def penultimate3[A](list: List[A]): A = list match {
    case p :: l :: Nil => p
    case p :: Nil => throw new NoSuchElementException
    case h :: t => penultimate(t)
    case _ => throw new NoSuchElementException
}
@main def P02(): Unit = {
    println(penultimate2(List(1,2,3,4,5,6)));
    //println(penultimate(List()));
    println(penultimate2(List(1,3)));
    //println(penultimate2(List(1)));
}