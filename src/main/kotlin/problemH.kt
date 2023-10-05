import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.round

fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    println("floor $x / $y = ${x.floorDiv(y)}")
    println("floor $x / $y = ${floor(x.toDouble()/y.toDouble()).toInt()}")
    println("ceil $x / $y = ${ceil(x.toDouble()/y.toDouble()).toInt()}")
    println("round $x / $y = ${round(x.toDouble()/y.toDouble()).toInt()}")

}