//Fungsi yang mengembalikan nilai kembali
fun main() {
    val lisNumber = listOf(1, 2, 3, 4, 5, 6)
    println("Jumlah nilai pada elemen listNumber = ${getSum(lisNumber)}")

}

fun getSum(values: List<Int>) : Int {
    var total = 0
    for (i in values) total += i
    return total
}