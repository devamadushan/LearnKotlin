fun main() {
    // put your code here
    var mot = readln().toString()
    val alphabet = 'a'
    for (lettre in ('a'..'z')){
        if(lettre !in mot){
            print(lettre)
        }
    }
//    for (i in mot){
//        println(i)
//
//
// }
}
