fun main() {
    val input = readLine()
    if (input == null) return
    val index = input.toInt()
    val word = readLine() ?: return
    if (index < 0 || index > word.length - 1) {
        println("There isn't such an element in the given string, please fix the index!")
        return
    }
    println(word[index])
}