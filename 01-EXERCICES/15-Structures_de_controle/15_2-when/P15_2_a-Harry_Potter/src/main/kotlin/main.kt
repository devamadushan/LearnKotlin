fun main() {
    // write your code here
    val house = readln().toString()
    when(house){
        "gryffindor"-> println("bravery")
        "hufflepuff" -> println("loyalty")
        "slytherin" -> println("cunning")
        "ravenclaw" -> println("intellect")

        else -> println("not a valid house")
    }
}
