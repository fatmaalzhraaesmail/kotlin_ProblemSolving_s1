fun main(args: Array<String>) {
    val input = readLine()!!.split(" "," ")
      val x =input[0].toInt()
      val c:Char
      val y =input[2].toInt()
      val r = input[4].toInt()
    if(input[1].contains('+')){
        c='+'
    }
    else if(input[1].contains('-')){
        c='-'
    }
    else if(input[1].contains('*')){
        c='*'
    }
    else if(input[1].contains('/')){
        c='/'
    }
    else {
        throw IllegalArgumentException("Invalid operator")
    }

    var result = when (c) {
        '+' -> x+y
        '-' -> x-y
        '*' -> x*y
        '/' -> x/y
        else -> throw IllegalArgumentException("Invalid operator")
    }
    if(result == r){
        print("yes")
    }
    else{
        println("No")
        print(result)
    }
}