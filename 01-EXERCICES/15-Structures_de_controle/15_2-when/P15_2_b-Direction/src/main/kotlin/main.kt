fun main() {
    // write your code here
    val direction = readln().toInt()
    when (direction) {
        1 -> println("move up")
        2 -> println("move down")
        3 -> println("move left")
        4 -> println("right")
        0 -> println("do not move")
    }
}
