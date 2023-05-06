fun main(args: Array<String>) {

    println("Hello, Ex1: рассчитаем комиссию за денежный перевод.")
    val amount = 10_000                         //ВВЕДИТЕ сумму перевода в рублях
    println("Сумма перевода " + amount + "руб.")
    var comission = if (amount * 0.0075 < 35) 35 else (amount * 0.0075).toInt()       //расчёт комиссии
    println("Комиссия составит $comission руб.")
    println()



    println("Ex2: про Лайки и человеко-людей.")
    val amountLikes: Int = 10_011               // ВВЕДИТЕ количество лайков
    if (amountLikes === 11 || (amountLikes - 11) % 100 === 0 || (amountLikes - 11) % 1000 === 0) {
        println("Понравилось $amountLikes людям")
    } else if ((amountLikes - 1) % 10 === 0) {
        println("Понравилось $amountLikes человеку")
    } else println("Понравилось $amountLikes людям")
    println()



    println("Ex3: Меломан.")
    val constantUsers = true        // выбор пользователя 1ый вариант
    val otherUsers = false            // выбор пользователя 1ый вариант
    //val constantUsers = false       // выбор пользователя 2ой вариант
    //val otherUsers = true         // выбор пользователя 2ой вариант

    val buy = 9_000              // ВВЕДИТЕ стоимость покупки пользователя
    var totPrice = 0

    if (buy > 0 && buy < 1001) {
        println(
            """Ваша покупка $buy руб.
        |Скидки до 1000р не предоставляются, выберите что-нибудь ещё, чтобы покупка стала выгоднее!
    """.trimMargin()
        )
    } else if (buy >= 1001 && buy <= 10000 && constantUsers) {
        totPrice = buy - 100
        println(
            """Ваша покупка $buy руб.
        |Стоимость после применения скидки $totPrice руб.
    """.trimMargin()
        )
        totPrice = (totPrice * 0.99).toInt()
        println(
            "Стоимость после применения 1% скидки $totPrice руб."
        )
    } else if (buy >= 1001 && buy <= 10000 && otherUsers) {
        totPrice = buy - 100
        println(
            """Ваша покупка $buy руб.
        |Стоимость после применения скидки $totPrice руб.
    """.trimMargin()
        )
    } else if (buy > 10001 && constantUsers) {
        totPrice = (buy * 0.95).toInt()
        println(
            """Ваша покупка $buy руб.
        |Стоимость после применения 5% скидки $totPrice руб.
    """.trimMargin()
        )
        totPrice = (totPrice * 0.99).toInt()
        println(
            "Стоимость после применения 1% скидки $totPrice руб."
        )
    } else if (buy > 10001 && otherUsers) {
        totPrice = (buy * 0.95).toInt()
        println(
            """Ваша покупка $buy руб.
        |Стоимость после применения 5% скидки $totPrice руб.
    """.trimMargin()
        )
    }
}