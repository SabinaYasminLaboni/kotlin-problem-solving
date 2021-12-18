import java.util.Scanner

fun main() {
    var input = Scanner(System.`in`)

    var num = input.nextInt()

    var rn = 0

    while (num > 0) {

        val r = num % 10
        num = num / 10
        rn = rn * 10 + r
    }

    println("$rn")

}

