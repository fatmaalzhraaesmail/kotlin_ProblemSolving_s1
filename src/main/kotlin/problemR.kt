fun main(args: Array<String>) {
    val x = readLine()!!.toInt()
    val year = x / 365
    val month = (x-(year*365))/30
    val days =(x % 365) % 30;
    println(" $year years")
    println(" $month months")
    println(" $days days")

}