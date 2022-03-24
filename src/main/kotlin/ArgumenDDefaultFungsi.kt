//nilai default memanggil fungsi untuk menghilangkan argument

fun main() {
    connectToOb()
    println()
    connectToOb("sqlserver", "septi")
}

fun connectToOb(hostname: String = "Localhost",
                username: String = "mysql",
                password: String = "secret") {
    println("hostname : $hostname")
    println("username : $username")
    println("password : $password")
}