//Jika di java sering terjadi NPE atau Null Pointer Exception
//maka di kotlin, kotlin ada bertujuan untuk menghilangkan NPE dari kode programnya.

//contoh nilai null
fun main() {
    var mayNumber: Int? = 15
    mayNumber = null
    println("mayNumber: $mayNumber ${mayNumber?.hashCode()}")
}