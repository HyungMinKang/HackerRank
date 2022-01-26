fun kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String {

    if(v1-v2<=0){
        return "NO"
    }
    else{
        if((x2-x1)%(v1-v2)==0){
            var jump = (x2-x1)/(v1-v2)
            return if(jump<=10000)"YES" else "NO"
        }
        else{
            return "NO"
        }
    }

}

fun main(args: Array<String>) {
    val first_multiple_input = readLine()!!.trimEnd().split(" ")

    val x1 = first_multiple_input[0].toInt()

    val v1 = first_multiple_input[1].toInt()

    val x2 = first_multiple_input[2].toInt()

    val v2 = first_multiple_input[3].toInt()

    val result = kangaroo(x1, v1, x2, v2)

    println(result)
}