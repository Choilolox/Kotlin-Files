data class Libro(val titulo: String, val autor: String, val paginas: Int)

fun main() {
    val libro = Libro("Kotlin para Todos", "Kevin Jones", 300)
    println(libro)
}
