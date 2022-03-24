//Kalkulator sederhana menggunakan percabangan When

fun main() {
    println("Welcom to our calculator")
    println("Enter the firs number: ")
    val a = readLine()!!.toDouble()
    println("Enter the second number: ")
    val b = readLine()!!.toDouble()
    println("Choose one of the following operations: ")
    println("1 - addition")
    println("2 - substraction")
    println("3 - multiplication")
    println("4 - dividion")

    val choice = readLine()!!.toInt()
    var result = 0.0
    when (choice) {
        1 -> result = a + b
        2 -> result = a - b
        3 -> result = a * b
        4 -> result = a / b
    }
    if ((choice > 0) && (choice < 5)) {
        println("Result: $result")
    } else {
        println("Invalid choice")
    }
    println("Thank you for using our calculator")
}