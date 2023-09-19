fun main() {
    // put your code here
    val h1 = readln().toDouble()
    val h2 = readln().toDouble()
    val h3 = readln().toDouble()
    val estCroisant = h1>=h2 && h2>=h3
    val estDecroisant = h1<=h2 && h2<=h3
   if(estCroisant || estDecroisant){
       print(true)
   }
    else {
        print(false)
   }
}