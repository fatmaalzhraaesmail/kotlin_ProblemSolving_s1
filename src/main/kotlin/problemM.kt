fun main(args: Array<String>) {
    val x = readLine()!!.first()
    if (x.isDigit()) {
        println("IS DIGIT")
    } else if (x.isLetter()) {
        if (x.isUpperCase()) {
            println("ALPHA")
            println("IS CAPITAL")
        } else {
            println("ALPHA")
            println("IS SMALL")
        }
    }



}