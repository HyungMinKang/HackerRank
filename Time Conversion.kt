import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    var pmAm= s.substring(8,10)
    var time = s.substring(0,8).split(":")
    var hour= time[0]
    var min = time[1]
    var sec = time[2]

    if(pmAm=="PM"){
        if(hour.toInt()<12){
            hour= (hour.toInt()+12).toString()
        }
    }
    else{
        if(hour.toInt()>=12){
            if(hour.toInt()-12 <10){
                hour= "0"+(hour.toInt()-12).toString()
            }
            else{
                hour= (hour.toInt()-12).toString()
            }
        }
    }
    return "$hour:$min:$sec"
}



fun main(args: Array<String>) {
    val s = readLine()!!

    val result = timeConversion(s)

    println(result)
}
