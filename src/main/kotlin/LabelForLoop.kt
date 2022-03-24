//label berbentuk sebuah identifier yang diikuti tanda @
//contoh label dalam program break dan continue pada perulangan for loop

fun main() {
    println("Example of break and continue label")
    myLabel@ for (x in 1..10) { //myLabel@ merupakan contoh label
        if (x == 5) {
            println("I am inside if block with value"+x+"\n-- hence it will close the operation")
            break@myLabel
        } else {
            println("I am inside else block with value"+x)
            continue@myLabel
        }
        println("Not Print")
    }
}