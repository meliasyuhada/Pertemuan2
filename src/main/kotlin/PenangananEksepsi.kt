import java.lang.Exception

// menghalangi aplikasi memberikan output yang salah saat runtime.
//turunan kelas Throwble
fun main() {
    try {
        val myVar: Int = 10
        val v:String = "Rekayasa Perangkat Lunak"
        v.toInt()
    } catch (e:Exception) {
        e.printStackTrace()
    } finally {
        println("Excaption Heandling in Kotlin")
    }
}