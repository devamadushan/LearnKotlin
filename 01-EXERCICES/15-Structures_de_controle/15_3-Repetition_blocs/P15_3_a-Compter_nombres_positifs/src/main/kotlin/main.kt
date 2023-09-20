fun main() {
    // put your code here
    val lenth = readln().toInt()
    var sum : Int =0
    repeat(lenth){
        var nombre = readln().toInt()
        if (nombre>0)
        sum++
    }
    print(sum)
}
