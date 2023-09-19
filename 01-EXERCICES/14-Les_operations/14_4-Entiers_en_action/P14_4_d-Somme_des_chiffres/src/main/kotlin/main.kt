fun main() {
    // put your code here
    val nombre = readln().toString()
    var tab = nombre.split("")
    val result = tab[1].toInt() + tab[2].toInt() + tab[3].toInt()
    print(result)
}