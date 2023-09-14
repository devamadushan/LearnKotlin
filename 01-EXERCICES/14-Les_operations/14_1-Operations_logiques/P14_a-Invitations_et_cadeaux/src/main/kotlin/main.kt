import java.util.Scanner

fun main() {
    print("Avez-vous une invetation ? :")
    val x = readLine().toBoolean() // read other values in the same way
    print("Avez-vous apportez un cadeau? :")
    val y = readLine().toBoolean()
    // write your code here
    var reponse = x &&  y
    print(reponse)
}

