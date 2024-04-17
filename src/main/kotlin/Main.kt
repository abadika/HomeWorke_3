fun main() {
    val numbers = arrayOf(8.0, -2.0, -4.0, 2.0, 3.0, 6.0, -1.0, 5.0, 7.0, -3.0, 9.0, 10.0, -5.0, 4.0, 1.0)
    var negativeFound = false
    var sum = 0.0
    var count = 0

    for (number in numbers) {
        if (number < 0 && negativeFound) break
        if (number < 0) negativeFound = true
        else if (negativeFound) { sum += number; count++ }
    }

    val average = if (count > 0) sum / count else 0.0
    println("Среднее арифметическое положительных чисел после первого отрицательного: $average")
}