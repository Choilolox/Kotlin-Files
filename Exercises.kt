// 1. Print name, age, and city
fun main() {
    val name = "Roberto"
    val age = 25
    val city = "Guadalajara"
    println("Name: $name")
    println("Age: $age")
    println("City: $city")
}

// 2. Basic operations
fun operations(a: Int, b: Int) {
    println("Sum: ${a + b}")
    println("Subtract: ${a - b}")
    println("Multiply: ${a * b}")
    println("Divide: ${a / b}")
}

// 3. Celsius to Fahrenheit
fun celsiusToFahrenheit(c: Double): Double {
    return c * 9 / 5 + 32
}

// 4. val vs var
val constant = "I don't change"
var variable = "I can change"

// 5. Grade check
fun grade(score: Int) {
    if (score >= 60) {
        println("Passed")
    } else {
        println("Failed")
    }
}

// 6. Day of the week
fun dayOfWeek(n: Int) {
    when(n) {
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
        else -> println("Invalid day")
    }
}

// 7. Print numbers 1 to 10
fun printNumbers() {
    for (i in 1..10) println("Number: $i")
}

// 8. Even numbers 1 to 20
fun printEvenNumbers() {
    for (i in 2..20 step 2) println("Even: $i")
}

// 9. Circle area
fun circleArea(r: Double): Double = Math.PI * r * r

// 10. Check if prime
fun isPrime(n: Int): Boolean {
    if (n <= 1) return false
    for (i in 2..n / 2) if (n % i == 0) return false
    return true
}

// 11. Function with default parameter
fun greet(name: String = "User") {
    println("Hello, $name")
}

// 12. Lambda function to add
val add: (Int, Int) -> Int = { a, b -> a + b }

// 13. List of names uppercase
val names = listOf("Ana", "Luis", "Pedro")
val upperNames = names.map { it.uppercase() }

// 14. Filter numbers greater than 10
val numbers = listOf(5, 15, 8, 22)
val filtered = numbers.filter { it > 10 }

// 15. Sort strings by length
val sortedByLength = names.sortedBy { it.length }

// 16. Sum all elements
val sumTotal = numbers.reduce { acc, i -> acc + i }

// 17. Class Student
class Student(val name: String, val age: Int, val average: Double) {
    fun isApproved() = average >= 60
}

// 18. Data class Product
data class Product(val name: String, val price: Double)

// 19. Filter list of objects
val products = listOf(
    Product("Laptop", 800.0),
    Product("Mouse", 25.0),
    Product("Keyboard", 45.0)
)
val expensive = products.filter { it.price > 100 }

// 20. Companion object counter
class User {
    companion object {
        var count = 0
        fun create() {
            count++
        }
    }
}

// 21. Basic null safety
fun printTextLength(text: String?) {
    println(text?.length ?: 0)
}

// 22. Nullable text length or zero
fun textLengthOrZero(input: String?): Int = input?.length ?: 0

// 23. Extension to reverse String
fun String.reverse(): String = this.reversed()

// 24. Sealed class Result
sealed class Result
class Success(val data: String): Result()
class Failure(val message: String): Result()

fun handleResult(result: Result) {
    when(result) {
        is Success -> println("Success: ${result.data}")
        is Failure -> println("Error: ${result.message}")
    }
}

// 25. Basic calculator
fun calculator(a: Double, b: Double, op: String): Double {
    return when (op) {
        "+" -> a + b
        "-" -> a - b
        "*" -> a * b
        "/" -> if (b != 0.0) a / b else Double.NaN
        else -> 0.0
    }
}

// 26. ATM simulator
var balance = 1000.0
fun deposit(amount: Double) { balance += amount }
fun withdraw(amount: Double) { if (amount <= balance) balance -= amount }

// 27. Guess the number game
fun guessGame(secret: Int, guess: Int) {
    if (guess < secret) println("Too low")
    else if (guess > secret) println("Too high")
    else println("Correct!")
}

// 28. Currency converter
fun convertCurrency(amount: Double, rate: Double): Double = amount * rate

// 29. Contact list
val contacts = mutableListOf<Pair<String, String>>()
fun addContact(name: String, phone: String) {
    contacts.add(Pair(name, phone))
}

// 30. Basic CRUD for tasks
val tasks = mutableListOf<String>()
fun addTask(task: String) = tasks.add(task)
fun removeTask(task: String) = tasks.remove(task)
fun listTasks() = tasks.forEach { println(it) }