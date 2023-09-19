fun main() {
    // write your code here
    val A = readln().toInt()
    val B = readln().toInt()
    val H = readln().toInt()

    if (H > A && H < B ){
        print("Normal")
    }

    else if (H < A ){
        print("Deficiency")
    }
    else if (H > B){
        print("Excess")
    }

}
