fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }
    println("${input.min()} ${input.max()}")


}