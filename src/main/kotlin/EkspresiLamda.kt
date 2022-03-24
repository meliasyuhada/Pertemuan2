/*
bentuk fungsi lambda

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }
 */

fun main() {
    println(MyFunction("Software Engginering"))

    val myLamda : (String)->Unit = {s:String-> print(s)}
    val v:String = "Informatics Engineering"
    myLamda(v)

    myFun(v, myLamda)
}

fun MyFunction(x: String): String {
    var c:String = "Hey!! Selamat datang To ...."
    return (c+x)
}

fun myFun(a:String, action:(String)->Unit) {
    print("\nHeyy!!")
    action(a)
}