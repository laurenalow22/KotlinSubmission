package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    try {
        val result = pow(4,-2)
        println("The result is: $result")
    } catch (e: ArithmeticException) {
        println("Error occurred: ${e.message}")
    }
}



fun pow(x: Int, y: Int): Int {
    if (y < 0) {
        throw ArithmeticException("y must be positive number!")
    } else {
        return Math.pow(x.toDouble(),y.toDouble()).toInt()
    }
}
