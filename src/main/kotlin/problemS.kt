fun main() {
    val x = readLine()!!.toDouble()

    val interval1 = x >= 0.0 && x <= 25.0
    val interval2 = x > 25.0 && x <= 50.0
    val interval3 = x > 50.0 && x <= 75.0
    val interval4 = x > 75.0 && x <= 100.0

    when {
        interval1 -> println("Interval [0,25]")
        interval2 -> println("Interval (25,50]")
        interval3 -> println("Interval (50,75]")
        interval4 -> println("Interval (75,100]")
        else -> println("Out of Intervals")
    }
}