// 1. Imprimir nombre, edad y ciudad
fun mainEs() {
    val nombre = "Roberto"
    val edad = 25
    val ciudad = "Guadalajara"
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Ciudad: $ciudad")
}

// 2. Operaciones básicas
fun operaciones(a: Int, b: Int) {
    println("Suma: ${a + b}")
    println("Resta: ${a - b}")
    println("Multiplicación: ${a * b}")
    println("División: ${a / b}")
}

// 3. Celsius a Fahrenheit
fun celsiusAFahrenheit(c: Double): Double {
    return c * 9 / 5 + 32
}

// 4. val vs var
val constante = "No cambio"
var variable = "Puedo cambiar"

// 5. Calificación
fun calificacion(puntaje: Int) {
    if (puntaje >= 60) {
        println("Aprobado")
    } else {
        println("Reprobado")
    }
}

// 6. Día de la semana
fun diaDeLaSemana(n: Int) {
    when(n) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miércoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6 -> println("Sábado")
        7 -> println("Domingo")
        else -> println("Día inválido")
    }
}

// 7. Imprimir números del 1 al 10
fun imprimirNumeros() {
    for (i in 1..10) println("Número: $i")
}

// 8. Números pares del 1 al 20
fun imprimirPares() {
    for (i in 2..20 step 2) println("Par: $i")
}

// 9. Área de un círculo
fun areaCirculo(r: Double): Double = Math.PI * r * r

// 10. Verificar si es primo
fun esPrimo(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) if (n % i == 0) return false
    return true
}

// 11. Función con valor por defecto
fun saludar(nombre: String = "Usuario") {
    println("Hola, $nombre")
}

// 12. Lambda para sumar
val sumar: (Int, Int) -> Int = { a, b -> a + b }

// 13. Lista de nombres en mayúsculas
val nombres = listOf("Ana", "Luis", "Pedro")
val nombresMayus = nombres.map { it.uppercase() }

// 14. Filtrar mayores a 10
val numeros = listOf(5, 15, 8, 22)
val filtrados = numeros.filter { it > 10 }

// 15. Ordenar strings por longitud
val ordenadosPorLongitud = nombres.sortedBy { it.length }

// 16. Sumar todos los elementos
val sumaTotal = numeros.reduce { acc, i -> acc + i }

// 17. Clase Alumno
class Alumno(val nombre: String, val edad: Int, val promedio: Double) {
    fun estaAprobado() = promedio >= 60
}

// 18. Data class Producto
data class Producto(val nombre: String, val precio: Double)

// 19. Lista de objetos filtrada
val productos = listOf(
    Producto("Laptop", 800.0),
    Producto("Mouse", 25.0),
    Producto("Teclado", 45.0)
)
val caros = productos.filter { it.precio > 100 }

// 20. Companion object contador
class Usuario {
    companion object {
        var cuenta = 0
        fun crear() {
            cuenta++
        }
    }
}

// 21. Null safety básica
fun imprimirLongitudTexto(texto: String?) {
    println(texto?.length ?: 0)
}

// 22. Longitud de texto nullable o cero
fun longitudTextoOZero(texto: String?): Int = texto?.length ?: 0

// 23. Extensión para invertir String
fun String.invertir(): String = this.reversed()

// 24. Sealed class Resultado
sealed class Resultado
class Exito(val datos: String): Resultado()
class Error(val mensaje: String): Resultado()

fun manejarResultado(resultado: Resultado) {
    when(resultado) {
        is Exito -> println("Éxito: ${resultado.datos}")
        is Error -> println("Error: ${resultado.mensaje}")
    }
}

// 25. Calculadora básica
fun calculadora(a: Double, b: Double, op: String): Double {
    return when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else Double.NaN
        else -> 0.0
    }
}

// 26. Simulador de cajero
var saldo = 1000.0
fun depositar(cantidad: Double) { saldo += cantidad }
fun retirar(cantidad: Double) { if (cantidad <= saldo) saldo -= cantidad }

// 27. Juego de adivina el número
fun juegoAdivina(secreto: Int, intento: Int) {
    if (intento < secreto) println("Muy bajo")
    else if (intento > secreto) println("Muy alto")
    else println("¡Correcto!")
}

// 28. Conversor de divisas
fun convertirDivisas(cantidad: Double, tasa: Double): Double = cantidad * tasa

// 29. Agenda de contactos
val contactos = mutableListOf<Pair<String, String>>()
fun agregarContacto(nombre: String, telefono: String) {
    contactos.add(Pair(nombre, telefono))
}

// 30. CRUD básico de tareas
val tareas = mutableListOf<String>()
fun agregarTarea(tarea: String) = tareas.add(tarea)
fun eliminarTarea(tarea: String) = tareas.remove(tarea)
fun listarTareas() = tareas.forEach { println(it) }