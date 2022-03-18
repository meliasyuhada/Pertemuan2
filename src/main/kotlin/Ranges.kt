//karakter unik kotlin
//berfungsi membantu dalam membuat sebuah deretan angka suatu iterasi

fun main() {
    val i: Int = 2
    for (j in 1..4)
        print(j)
    println()

    if (i in 1..10) {
        println("We found your number --" +i)
    }
}