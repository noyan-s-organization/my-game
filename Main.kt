//versions 1.3
fun main() {
    var hpPlayer = 100
    var hpDragon = 100
    val damageDrakon = 32
    val damagePlayer = 15
    var mercy = 3
    main@ while (true) {
        if (mercy >= 5) {
            println("вы добрый, дракон вас отпустил, нажмите enter чтобы выйти")
            readln()
            break@main
        }
        val randomPotion = (1..100).random()
        if (randomPotion == 50) {
            if (hpPlayer == 100) {
                println("вы нашли зелье, но вы здоровы")
            } else {
                hpPlayer = 100
                println("вы нашли зелье, ваше здоровье: $hpPlayer")
            }
        }
        val dragonStrike = (1..mercy).random()
        when (dragonStrike) {
            3 -> {
                hpPlayer = (hpPlayer - damageDrakon).coerceAtLeast(0)
                println("вас ударил дракон. ваше хп: $hpPlayer")
                if (hpPlayer < 1) {
                    println("вы проиграли, нажмите enter чтобы выйти")
                    readln()
                    break@main
                }
            }
        }
        println("ударить дракона?(д/н)")
        val choice = readln()
        when (choice) {
            "д" -> {
                hpDragon = (hpDragon - damagePlayer).coerceAtLeast(0)
                println("вы ударили дракона. хп дракона: $hpDragon")
                mercy = 3
                if (hpDragon <= 0) {
                    println("вы победили, нажмите enter чтобы выйти")
                    readln()
                    break@main
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
