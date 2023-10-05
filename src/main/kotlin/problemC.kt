fun main(args: Array<String>) {
//    val x:Int = readLine()!!.toInt()
//    val y:Int = readLine()!!.toInt()
//    var sum=x+y
//    println("$x + $y = ${x+y} ")
//    println("$x * $y = ${x*y}")
//    println("$x - $y = ${x-y}")


    //another sol
    val (x, y) = readLine()!!.split(" ").map { it.toInt() }

    val sum = x + y
    val multiplication = x * y
    val subtraction = x - y

    println("$x + $y = $sum")
    println("$x * $y = $multiplication")
    println("$x - $y = $subtraction")

}