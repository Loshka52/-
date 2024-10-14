import kotlin.random.Random

fun main() {
    while (true) {
        val playerChoice = ViborIgroka()
        val computerChoice = ViborPK()
        println("Компьютер выбрал: $computerChoice")
        println("Вы выбрали: $playerChoice")

        val result = ViborPobeditela (playerChoice, computerChoice)
        println(result)

        if (result != "Ничья") break }
}

fun ViborIgroka (): String {
    while (true) {
        println("Введите ваш выбор (1 - Камень, 2 - Ножницы, 3 - Бумага): ")
        val playerInput = readLine()
        return when (playerInput) {
            "1" -> "Камень"
            "2" -> "Ножницы"
            "3" -> "Бумага"
            else -> {
                println("Неверный ввод. Попробуйте снова.")
                continue
            }
        }
    }
}

fun ViborPK (): String {
    val options = listOf("Камень", "Ножницы", "Бумага")
    return options[Random.nextInt(options.size)]
}

fun ViborPobeditela (player: String, computer: String): String {
    return if (player == computer) {
        "Ничья"
    } else if ((player == "Камень" && computer == "Ножницы") ||
        (player == "Ножницы" && computer == "Бумага") ||
        (player == "Бумага" && computer == "Камень")) {
        "Вы выиграли!"
    } else {
        "Компьютер выиграл!"
    }
}

