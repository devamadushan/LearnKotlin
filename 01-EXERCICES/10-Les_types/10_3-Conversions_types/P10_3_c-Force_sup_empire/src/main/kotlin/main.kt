
fun main() {
    val empiresShip = readln().toString()
    val alliancesShip = readln().toString()

    val ratioDouble: Double = empiresShip.toDouble() / alliancesShip.toDouble()
    val ratio = ratioDouble.toInt()
    println(ratio)
}