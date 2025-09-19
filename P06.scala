// Find out if a list is a palindrome

// O(n) time complexity
def isPalindrome_1[A](l: List[A]): Boolean = {
    l.reverse == l
}



@main def P06 = {
    println(isPalindrome_1(List(1, 2, 3, 2, 1)))
    println(isPalindrome_1(List(1)))
    println(isPalindrome_1(List(1,2)))
}