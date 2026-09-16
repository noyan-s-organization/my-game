//versions 1.1
fun main() {
    var hpPlayer = 100
    var hpDragon = 100
    val damageDrakon = 32
    val damagePlayer = 15
    var mercy = 3
    main@ while (true) {
        val randomPotion = (1..100).random()
        if (randomPotion == 50) {
            if (hpDragon == 100) {

            }
            hpPlayer = 100
            println("вы нашли зелье, ваше здоровье: $hpPlayer")
        } else if (mercy >= 7) {
             println("вы добрый, дракон вас отпустил, нажмите enter чтобы выйти")
            readln()
            break@main
        }
        val DragonStrike = (1..mercy).random().toInt()
        when (DragonStrike) {
            3 -> {
                hpPlayer = hpPlayer - damageDrakon
                if (hpPlayer <= 0) hpPlayer = 0
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
                hpDragon = hpDragon - damagePlayer
                if (hpDragon <= 0) hpDragon = 0
                println("вы ударили дракона. хп дракона: $hpDragon")
                if (hpDragon <= 0) {
                    println("вы победили, нажмите enter чтобы выйти")
                    readln()
                    break@main
                }
            }
            "н" ->{
                println("вы не ударили дракона")
                mercy = mercy + 1
            }
            else -> println("ошибка")
        }
    }
}
