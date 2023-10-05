fun main(args: Array<String>) {
    val (x,y) = readLine()!!.split(" ").map { it.toDouble() }
    if(x>0 && y>0){
        print("Q1")
    }
    else if(x==0.0){
        print("Eixo Y")
    }
    else if(y==0.0){
        print("Eixo X")
    }
    else if (x<0 && y<0){
        print("Q3")
    }
    else if (x<0 && y>0){
        print("Q2")
    }
    else if (x>0 && y<0){
        print("Q4")
    }
    else{
        print("Origem")
    }
}