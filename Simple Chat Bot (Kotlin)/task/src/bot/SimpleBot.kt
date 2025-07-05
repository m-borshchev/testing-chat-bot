package bot

import java.util.Scanner


val scanner = Scanner(System.`in`) // Do not change this line

fun main() {
    greet("Mykola", "2025") // change it as you need
    remindName()
    guessAge()
    count()
    test() // ...
    end()
}

fun greet(assistantName: String, birthYear: String) {
    println("Hello! My name is ${assistantName}.")
    println("I was created in ${birthYear}.")
    println("Please, remind me your name.")
}

fun remindName() {
    val name = scanner.nextLine()
    println("What a great name you have, ${name}!")
}

fun guessAge() {
    println("Let me guess your age.")
    println("Enter remainders of dividing your age by 3, 5 and 7.")
    val rem3 = scanner.nextInt()
    val rem5 = scanner.nextInt()
    val rem7 = scanner.nextInt()
    val age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105
    println("Your age is ${age}; that's a good time to start programming!")
}

fun count() {
    println("Now I will prove to you that I can count to any number you want.")
    val num = scanner.nextInt()
    for (i in 0..num) {
        print(i)
        println("!")
    }
}

fun test() {
    println("Let's test your programming knowledge.")
    println(
        "Why we doing this bot?\n" +
                "1. To achieve the certificate.\n" +
                "2. To learn how to use Kotlin for resolving demands.\n" +
                "3. To procrastinate daily and make imagine of studying.\n" +
                "4. To be smarter, better, faster, stronger"
    ) // write your code here
    var answer: Int
    do {
        answer = readln().toInt()
        println("Please, try again.")
    } while (answer !in 2..<3)
}

fun end() {
    println("Congratulations, have a nice day!")
}

// Do not change this text
