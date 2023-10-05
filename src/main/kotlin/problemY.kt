fun main(args: Array<String>) {
    val input = readLine()!!.split(" ").map { it.toInt() }
    var res=1
    for (i:Int in input){
        res*=i
    }
    print(res%100)
}