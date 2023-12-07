import java.util.Scanner


fun main() {
    val scanner = Scanner(System.`in`)
    val botName = "ConsoleBot"
    val birthYear = 2023
    println(
        """
        Hello! My name is ${botName}.
        I was created in ${birthYear}.
        Please, remind me your name.""".trimIndent()
    )
    val yourName = scanner.nextLine()
    println(
        """
        What a great name you have, ${yourName}!
        Let me guess your age.
        Enter remainders of dividing your age by 3, 5 and 7.""".trimIndent()
    )
    val div3: Int = scanner.nextInt()
    val div5: Int = scanner.nextInt()
    val div7: Int = scanner.nextInt()
    val yourAge = (div3 * 70 + div5 * 21 + div7 * 15) % 105
    println(
        """
        Your age is ${yourAge}; that's a good time to start programming!
        Now I will prove to you that I can count to any number you want.""".trimIndent()
    )
    val a = scanner.nextInt()
    for (i in 0..a) {
        println("$i!")
    }
    println("Completed, have a nice day!")
    println(
        """
    Let's test your programming knowledge.
    Why do we use methods?
    1. To repeat a statement multiple times.
    2. To decompose a program into several small subroutines.
    3. To determine the execution time of a program.
    4. To interrupt the execution of a program.""".trimIndent()
    )
    var answer = scanner.nextInt()
    while (answer != 2) {
        println("Please, try again.")
        answer = scanner.nextInt()
    }
    println("Congratulations, have a nice day!")
}
