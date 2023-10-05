fun main(args: Array<String>) {
    val x = readLine()!!.first()

        if (x.isUpperCase()) {
            println("${x.toLowerCase()}")

        } else {
            println("${x.toUpperCase()}")
        }
}