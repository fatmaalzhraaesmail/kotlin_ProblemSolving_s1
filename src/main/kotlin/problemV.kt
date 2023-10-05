fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val x =input[0].toInt()
    val y = input[1]
    val z =input[2].toInt()

    val result = when (y) {
        "<" -> x < z
        ">" -> x > z
        "=" -> x == z
        else -> false
    }

    if (result) {
        println("Right")
    } else {
        println("Wrong")
    }


}