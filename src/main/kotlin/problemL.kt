fun main(args: Array<String>) {
    val firstPerson = readLine()!!.split(" ")
    val secondPerson = readLine()!!.split(" ")
    if(firstPerson[1]==secondPerson[1]){
        println("ARE Brothers")
    }
    else{
        println("Not")
    }


}