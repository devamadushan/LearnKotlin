fun main() {
    // put your code here
    var mot = readln().toString()
for (l in mot){
    if(l in ('1'..'9')){
        println(l)
        break
    }
}

//    test@ for (l in mot){
//        for (i in 1..9){
//            if (l.toString() == i.toString()){
//                println(l)
//                break@test
//
//            }
//        }
//    }
}
