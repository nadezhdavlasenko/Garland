import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader: BufferedReader = BufferedReader(InputStreamReader(System.`in`))
     val list = reader.readLine().split(" ")
    val numberOfLamps = list[0].toInt()
    val leftmostHeight = list[1].toDouble()
    println("numberOfLamps=$numberOfLamps")
    print(("leftmostHeight=$leftmostHeight"))
}