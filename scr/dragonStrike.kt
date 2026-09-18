fun dragonStrike(dragonStrike: Int, hpPlayer: Int,damageDragon: Int): Int {
    var HpPlayer = hpPlayer
    if (dragonStrike == 1) {
        HpPlayer = (hpPlayer - damageDragon).coerceAtLeast(0)
        println("вас ударил дракон. ваше хп: $HpPlayer")
    }

    return HpPlayer
}
