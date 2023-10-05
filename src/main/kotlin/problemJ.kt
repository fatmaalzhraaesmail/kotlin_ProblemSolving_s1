fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map { it.toInt() }
    if(x%y==0 || y%x==0){
        println("Mulitplies")
    }
    else{
        println("No Mulitplies")
    }

}