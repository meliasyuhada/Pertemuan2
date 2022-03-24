//break untuk menghentikan proses perulangan
//continue untuk melanjutkan perulangan

//contoh break & continue

fun main() {
    var x: Int
    println("Example of Break and Continue in For-Loop")
    for (x in 1..10) {
        if (x == 7)
            break
        if (x == 3)
            continue
        print("$x ")
    }
    print('\n')
}