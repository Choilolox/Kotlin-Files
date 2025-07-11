interface Volador {
    fun volar()
}

class Pajaro : Volador {
    override fun volar() {
        println("El pájaro está volando")
    }
}

fun main() {
    val p = Pajaro()
    p.volar()
}
