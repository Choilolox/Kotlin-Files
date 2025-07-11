open class Animal(val nombre: String) {
    open fun hablar() = println("$nombre hace un sonido")
}

class Perro(nombre: String): Animal(nombre) {
    override fun hablar() = println("$nombre dice: Guau!")
}

fun main() {
    val perro = Perro("Firulais")
    perro.hablar()
}
