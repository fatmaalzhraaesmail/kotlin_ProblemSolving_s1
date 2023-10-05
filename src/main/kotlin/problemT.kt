fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }
    val orderedList = input.sorted()
    for( i:Int in orderedList){
        println(i)
    }
    println()
    for( i:Int in input){
        println(i)
    }

}