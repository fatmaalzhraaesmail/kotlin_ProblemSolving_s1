fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toDouble() }
    if((Math.pow(input[0],input[1])) > (Math.pow(input[2],input[3]))){
            println("Yes")
        }
        else{
            println("No")
    }
}