//versions 1.4
fun main() {
    var hpPlayer = 100
    var hpDragon = 100
    val damageDragon = 32
    val damagePlayer = 15
    var mercy = 3
    while (true) {
        if (mercy >= 7) {
            println("вы добрый, дракон вас отпустил, нажмите enter чтобы выйти")
            readln()
            break
        }
        val randomPotion = (1..80).random()
        if (randomPotion == 50) {
            if (hpPlayer == 100) {
                println("вы нашли зелье, но вы здоровы")
            } else {
                hpPlayer = (hpPlayer + 30).coerceAtMost(100)
                println("вы нашли зелье, ваше здоровье: $hpPlayer")
            }
        }
        val strikeRandom = mercy
        val dragonStrike = (1..strikeRandom).random()
        if (dragonStrike == 1) {
                hpPlayer = (hpPlayer - damageDragon).coerceAtLeast(0)
                println("вас ударил дракон. ваше хп: $hpPlayer")
                if (hpPlayer == 0) {
                    println("вы проиграли, нажмите enter чтобы выйти")
                    readln()
                    break
                }
            }
        println("ударить дракона?(д/н)")
        val choice = readln().trim().lowercase()
        when (choice) {
            "д" -> {
                hpDragon = (hpDragon - damagePlayer).coerceAtLeast(0)
                println("вы ударили дракона. хп дракона: $hpDragon")
                mercy = 3
                if (hpDragon == 0) {
                    println("вы победили, нажмите enter чтобы выйти")
                    readln()
                    break
                }
            }
            "н" -> {
                println("вы не ударили дракона")
                mercy += 1
            }
            else -> println("ошибка")
        }
    }
}
