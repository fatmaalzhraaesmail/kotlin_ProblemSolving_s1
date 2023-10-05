fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    if(x>=y){
        println("yes")
    }
    else{
        println("no")

    }

}