//penggunaannya dalam bahasa java sama.
fun main() {
    var x: Int = 0
    println("Example of while loop--")
    while (x <= 10) {
        print("$x ")
        x++
    }
    print('\n')

    //Do While
    var y: Int = 0
    do {
        y = y + 10
        println("I am inside do block---" +y)
    } while (y <= 50)
}