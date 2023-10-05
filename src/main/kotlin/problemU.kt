fun main() {
    val n = readLine()!!.toDouble()

    if (n % 1 == 0.0) {
        println("int ${n.toInt()}")
    } else {
        val integerPart = n.toInt()
        val decimalPart = n - integerPart
        println("float $integerPart ${decimalPart}")
    }
}