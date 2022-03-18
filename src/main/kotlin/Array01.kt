//class Array01<T>private constructor(){
//    val size: Int
//    operator fun get(indes: Int): T
//    operator  fun set(index: Int, value: T): Unit
//    operator fun iterator(): iterator<T>
//}

fun main() {
    //creates on Array<String> with sizes 5 and values ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
        i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}