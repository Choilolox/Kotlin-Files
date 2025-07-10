//1. Introducción y sintaxis básica

fun main() {
    val nombre = "Roberto"
    var edad = 30

    println("Hola, $nombre")
    println("Tienes $edad años")
}

fun suma(a: Int, b: Int): Int {
    return a + b
}
//2. Variables, tipos y control de flujo

fun main() {
    val x = 10
    val y = 20

    if (x > y) {
        println("x es mayor que y")
    } else {
        println("y es mayor o igual que x")
    }

    for (i in 1..5) {
        println("Número: $i")
    }

    when (x) {
        5 -> println("Es cinco")
        10 -> println("Es diez")
        else -> println("Es otro número")
    }
}
//3. Funciones y lambdas

fun operar(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val suma = operar(5, 3) { x, y -> x + y }
    val multiplicacion = operar(5, 3) { x, y -> x * y }

    println("Suma: $suma")
    println("Multiplicación: $multiplicacion")
}
//4. Clases, objetos y data classes

class Persona(val nombre: String, var edad: Int) {
    fun saludar() {
        println("Hola, soy $nombre y tengo $edad años")
    }
}

data class Usuario(val nombre: String, val correo: String)

fun main() {
    val p = Persona("Roberto", 30)
    p.saludar()

    val usuario1 = Usuario("Ana", "ana@mail.com")
    val usuario2 = usuario1.copy(nombre = "Luis")
    println(usuario1)
    println(usuario2)
}
//5. Colecciones y operaciones funcionales

fun main() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val pares = numeros.filter { it % 2 == 0 }
    val cuadrados = numeros.map { it * it }

    println("Números pares: $pares")
    println("Cuadrados: $cuadrados")
}
//6. Nullabilidad y seguridad de tipos

fun main() {
    var texto: String? = "Hola mundo"

    println(texto?.length)  // 10
    println(texto ?: "Texto vacío")

    texto = null
    texto?.let {
        println("El texto es $it")
    } ?: println("Texto es null")
}
//7. Funciones de extensión

fun String.quitarEspacios(): String {
    return this.replace(" ", "")
}

fun main() {
    val frase = "Hola Mundo Kotlin"
    println(frase.quitarEspacios())  // HolaMundoKotlin
}
//8. Sealed classes y jerarquías

sealed class Resultado
data class Exito(val datos: String) : Resultado()
data class Error(val mensaje: String) : Resultado()

fun manejarResultado(resultado: Resultado) {
    when (resultado) {
        is Exito -> println("Datos: ${resultado.datos}")
        is Error -> println("Error: ${resultado.mensaje}")
    }
}

fun main() {
    val resultado1: Resultado = Exito("Carga exitosa")
    val resultado2: Resultado = Error("Error de red")

    manejarResultado(resultado1)
    manejarResultado(resultado2)
}
//9. Companion object y objetos singleton

class Contador {
    companion object {
        var cuenta = 0
        fun incrementar() {
            cuenta++
        }
    }
}

fun main() {
    Contador.incrementar()
    Contador.incrementar()
    println(Contador.cuenta)  // 2
}
//10. Interoperabilidad con Java (conceptos básicos)

// Kotlin llama código Java:

fun main() {
    val listaJava = java.util.ArrayList<String>()
    listaJava.add("Kotlin")
    listaJava.add("Java")

    for (item in listaJava) {
        println(item)
    }
}