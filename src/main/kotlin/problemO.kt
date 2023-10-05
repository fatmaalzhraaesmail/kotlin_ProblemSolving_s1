fun main() {
    val input = readLine()!!
    val input1=input.split(Regex("[+\\-*/]"))
    val a = input1[0].toInt()

    var s:Char
    val b = input1[1].toInt()
    if(input.contains('+')){
        s='+'
    }
    else if(input.contains('-')){
        s='-'
    }
    else if(input.contains('*')){
        s='*'
    }
    else if(input.contains('/')){
        s='/'
    }
    else {
        throw IllegalArgumentException("Invalid operator")
    }
    var result = when (s) {
        '+' -> a + b
        '-' -> a - b
        '*' -> a * b
        '/' -> a / b
        else -> throw IllegalArgumentException("Invalid operator")
    }

    println(result)
}