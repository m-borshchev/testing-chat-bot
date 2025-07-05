import java.util.Scanner

fun main() {
    val scanner = Scanner(System.`in`)

    // Read the input month number
    val monthNumber = scanner.nextInt()

    // Use a when expression to determine the corresponding season
    val season = when (monthNumber) {
        // TODO: Add cases for each month range and the corresponding season
        else -> "Invalid month number"
    }

    println(season)
}