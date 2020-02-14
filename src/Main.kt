import java.io.BufferedReader
import java.io.InputStreamReader

fun main() {
    val reader = BufferedReader(InputStreamReader(System.`in`))
     val list = reader.readLine().split(" ")
    val numberOfLamps = list[0].toInt()
    val leftmostHeight = list[1].toDouble()
    println("numberOfLamps=$numberOfLamps")
    print(("leftmostHeight=$leftmostHeight"))
}

fun findRightBorder(numberOfLamps: Int, leftmostHeight: Double) {
    val bad = -1
    var rightMostHeight = Double.MAX_VALUE
    for (i in 0 until numberOfLamps) {
        val height = 
    }
}