fun main() {
    // write your code here
    val lenth = readln().toInt()
    var min = 100

    for (i in 1..lenth){
        var num = readln().toInt()
        if (num < min){
            min = num
        }
    }
    println(min)
}
