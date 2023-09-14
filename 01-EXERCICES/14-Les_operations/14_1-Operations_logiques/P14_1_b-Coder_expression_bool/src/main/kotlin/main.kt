import java.util.Scanner

fun main() {
    print("x:")
    val x = readLine().toBoolean() // read other values in the same way
    print("y:")
    val y = readLine().toBoolean()
    print("z:")
    val z = readLine().toBoolean()
    // write your code here
    var reponse = !x&&y || z
    print(reponse)
}

