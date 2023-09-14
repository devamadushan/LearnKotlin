import java.util.Scanner

fun main() {
    // write your code here
    var scanner = Scanner(System.`in`)

    val mot = scanner.next()
    val N= scanner.nextInt()

    println( "symbol #$N of the sring $mot est ${mot[N]}")

}

