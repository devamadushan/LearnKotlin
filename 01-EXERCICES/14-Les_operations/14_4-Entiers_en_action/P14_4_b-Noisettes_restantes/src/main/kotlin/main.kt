fun main() {
    // put your code here
    println("combien de personnes :")
    var personne = readln().toInt()

    println("combien de noisette :")
    var noisette = readln().toInt()

    print("${noisette%personne}  qui restent")
}
