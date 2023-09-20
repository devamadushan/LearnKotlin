fun main() {
    // put your code here
    val long = readln().toInt()
    var D :Int=0
    var C :Int=0
    var B :Int=0
    var A :Int=0

    repeat(long){
        val number = readln().toInt()
        when(number){
            2 -> D++
            3 -> C++
            4 -> B++
            5 -> A++
        }

    }
    println("$D $C $B $A ")
    //println(D.toString()  + C.toString() + B.toString() + A.toString())
}
