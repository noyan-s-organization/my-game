fun dragonStrike(dragonStrike: Int, hpPlayer: Int,damageDragon: Int): Int {
    var HpPlayer = hpPlayer
    if (hpPlayer == 0) {
        println("вы проиграли, нажмите enter чтобы выйти")
        readln()
        return 101 //кодовое число controller.kt
        if (dragonStrike == 1) {
            HpPlayer = (hpPlayer - damageDragon).coerceAtLeast(0)
            println("вас ударил дракон. ваше хп: $HpPlayer")
        }
    }
    return HpPlayer
}