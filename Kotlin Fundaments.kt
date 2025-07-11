
//1. Introduction and basic syntax

fun main() {
    val name = "Roberto"
    var age = 30

    println("Hello, $name")
    println("You are $age years old")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

//2. Variables, types and control flow

fun main() {
    val x = 10
    val y = 20

    if (x > y) {
        println("x is greater than y")
    } else {
        println("y is greater than or equal to x")
    }

    for (i in 1..5) {
        println("Number: $i")
    }

    when (x) {
        5 -> println("It is five")
        10 -> println("It is ten")
        else -> println("It is another number")
    }
}

//3. Functions and lambdas

fun operate(a: Int, b: Int, op: (Int, Int) -> Int): Int {
    return op(a, b)
}

fun main() {
    val addition = operate(5, 3) { x, y -> x + y }
    val multiplication = operate(5, 3) { x, y -> x * y }

    println("Addition: $addition")
    println("Multiplication: $multiplication")
}

//4. Classes, objects and data classes

class Person(val name: String, var age: Int) {
    fun greet() {
        println("Hi, I'm $name and I'm $age years old")
    }
}

data class User(val name: String, val email: String)

fun main() {
    val p = Person("Roberto", 30)
    p.greet()

    val user1 = User("Ana", "ana@mail.com")
    val user2 = user1.copy(name = "Luis")
    println(user1)
    println(user2)
}

//5. Collections and functional operations

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val evens = numbers.filter { it % 2 == 0 }
    val squares = numbers.map { it * it }

    println("Even numbers: $evens")
    println("Squares: $squares")
}

//6. Nullability and type safety

fun main() {
    var text: String? = "Hello world"

    println(text?.length)  // 11
    println(text ?: "Empty text")

    text = null
    text?.let {
        println("The text is $it")
    } ?: println("Text is null")
}

//7. Extension functions

fun String.removeSpaces(): String {
    return this.replace(" ", "")
}

fun main() {
    val sentence = "Hello Kotlin World"
    println(sentence.removeSpaces())  // HelloKotlinWorld
}

//8. Sealed classes and hierarchies

sealed class Result
data class Success(val data: String) : Result()
data class Failure(val message: String) : Result()

fun handleResult(result: Result) {
    when (result) {
        is Success -> println("Data: ${result.data}")
        is Failure -> println("Error: ${result.message}")
    }
}

fun main() {
    val result1: Result = Success("Load successful")
    val result2: Result = Failure("Network error")

    handleResult(result1)
    handleResult(result2)
}

//9. Companion object and singleton objects

class Counter {
    companion object {
        var count = 0
        fun increment() {
            count++
        }
    }
}

fun main() {
    Counter.increment()
    Counter.increment()
    println(Counter.count)  // 2
}

//10. Java interoperability (basic concepts)

// Kotlin calling Java code:

fun main() {
    val javaList = java.util.ArrayList<String>()
    javaList.add("Kotlin")
    javaList.add("Java")

    for (item in javaList) {
        println(item)
    }
}
```

¿Te gustaría que te lo entregue en **PDF** o con comentarios explicativos en cada sección?
