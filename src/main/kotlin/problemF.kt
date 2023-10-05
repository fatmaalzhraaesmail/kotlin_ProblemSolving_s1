fun main(args: Array<String>) {
val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    val summationOfListDigit =(x%10)+(y%10)
    println(summationOfListDigit)
}