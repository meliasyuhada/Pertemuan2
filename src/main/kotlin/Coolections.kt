//koleksi yang berisi onjek dan memiliki tipe yang sama.
fun printAll(strings: Collection<String>) {
    for (s in strings) print("$s ")
    println()
}

//object collections
fun main() {
    //object list
    val stringList = listOf("one", "two", "onw")
    printAll(stringList)

    //object set
    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)
}