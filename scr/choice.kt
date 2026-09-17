fun Choice(choice: String, hpDragon: Int, damagePlayer: Int, mercy: Int): Pair<Int, Int> {
    var HpDragon = 0
    var Mercy = mercy
    when (choice) {
        "д" -> {
            HpDragon = (hpDragon - damagePlayer).coerceAtLeast(0)
            println("вы ударили дракона. хп дракона: $HpDragon")
            Mercy = 3
        }

        "н" -> {
            println("вы не ударили дракона")
            Mercy += 1
        }

        else -> println("ошибка")
    }
    return Pair(HpDragon, Mercy)
}