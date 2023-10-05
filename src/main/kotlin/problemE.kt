fun main(args: Array<String>) {
    val pi=3.141592653
    val r:Int = readLine()!!.toInt()
    val area = pi*r*r
    val areaa=pi*Math.pow(r.toDouble(),2.0)
    println(area)
    print(areaa)


}