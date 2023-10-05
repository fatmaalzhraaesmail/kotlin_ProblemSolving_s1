fun main(args: Array<String>) {
  val input = readLine()!!.split(" ").map {
    it.toInt()
  }
    val sum=(input[0]*input[1])-(input[2]*input[3])
  print("$sum")
}