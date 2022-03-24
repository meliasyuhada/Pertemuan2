//return berrguna untuk keluar dari fungsi dan mengembalikan suatu nialai kepada pemanggila fungsi
//contoh return

fun main() {
    returnLoop()
}
fun returnLoop() {
    var x: Int
    println("Example of return in for-loop")
    for (x in 1..10) {
        if (x < 5) {
            print("${x - 1} ")
        } else {
            return
        }
        print("$x")
    }
    print("Tidak akan pernah dieksekusi")
}