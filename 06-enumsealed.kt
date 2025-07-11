enum class Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES
}

sealed class Resultado
class Exito(val data: String) : Resultado()
class Error(val mensaje: String) : Resultado()

fun manejarResultado(resultado: Resultado) {
    when (resultado) {
        is Exito -> println("Todo bien: ${resultado.data}")
        is Error -> println("Error: ${resultado.mensaje}")
    }
}

fun main() {
    manejarResultado(Exito("Carga completada"))
    manejarResultado(Error("Fallo de red"))
}
