import kotlin.math.sqrt

fun main() {
    print("Enter some number and I'll calculate a square root: ")
    val a = readLine()!!.toDouble()
    if (a > 0) {
        println("The number you entered is greater then 0, so i can calculate it!")
        val root = sqrt(a)
        println("The squere root of $a is $root")
    } else {
        println("I can't calculate the squere root of a negative number!")

        println("Thanks for the input")
    }
}