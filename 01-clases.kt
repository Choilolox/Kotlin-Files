class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, mi nombre es $nombre y tengo $edad años")
    }
}

fun main() {
    val persona = Persona("Roberto", 22)
    persona.saludar()
}
