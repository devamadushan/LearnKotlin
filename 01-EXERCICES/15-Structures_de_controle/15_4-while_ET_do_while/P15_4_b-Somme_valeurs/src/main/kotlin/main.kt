fun main() {
    // put your code here
    var sum = 0
    do {
        var nombre = readln().toInt()
        sum+= nombre
    } while (nombre > 0 || nombre <0)

    println(sum)
}
