fun main() {
    try {
    val a = "Hello"
    val b = a.toInt()// write your code here, do not touch the lines above

    // do not touch the lines below    
    } catch(e: RuntimeException) {
        println("Well")
    } catch (e: Exception) {
        println("Wrong")
    }
}