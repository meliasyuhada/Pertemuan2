//Operator pengganti switch case dalam bahasa C
fun main() {
    var x: Int = 5
    when (x) {
        1 -> println("x == 1")
        2 -> println("x == 2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
    x = 2
    when (x) {
        1,2 -> println("Value of x either 1,2")
        else -> {
            println("x is neither 1 nor 2")
        }
    }
}