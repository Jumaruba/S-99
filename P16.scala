def drop[A](n: Int, l: List[A]): List[A] = {
    l.zipWithIndex.foldRight(List.empty[A]){(e, acc) => {
        if (e._2 % n == 0) acc 
        else e._1 :: acc
    }
    }
}

// another solution a little more functional
def drop_1[A](n: Int, l: List[A]): List[A] = {
    l.zipWithIndex filter { e => (e._2 % n) != 0 } map { e => e._1 }
}

@main def P16 = {
    println(drop(2, List(1,2,3,4,5,6,7,8,9)))
}