fun main(args: Array<String>) {

        val input = readLine()!!.split(" ").map { it.toInt() }
        val low1 = input[0]
        val high1 = input[1]
        val low2 = input[2]
        val high2 = input[3]

        val intersectionLeft = maxOf(low1, low2)
        val intersectionRight = minOf(high1, high2)

        if (intersectionLeft <= intersectionRight) {
            println("$intersectionLeft $intersectionRight")
        } else {
            println(-1)
        }
    }
