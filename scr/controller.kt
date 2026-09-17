fun controller() {
    var exit = true
    var mercy = 3
    var hpPlayer = 100
    val damagePlayer = 15
    val damageDragon = 32
    var hpDragon = 200
    while (exit) {
        exit = Mercy(mercy)
        val randomPotion = (1..80).random()
        if (randomPotion == 1) {
            hpPlayer = RandomPotion(hpPlayer)
        }
        val strikeRandom = mercy
        val dragonStrike = (1..strikeRandom).random()
        if (dragonStrike == 1) {
            val exit101 = dragonStrike(dragonStrike, hpPlayer, damageDragon)
            if (exit101 == 101) {
                break
            } else {
                hpPlayer = exit101
            }
        }
        println("ударить дракона?(д/н)")
        val choice = readln().trim().lowercase()
        val CHoise = Choice(choice, hpDragon, damagePlayer, mercy)
        hpDragon = CHoise.first
        if (hpDragon == 0) {
            println("вы победили, нажмите enter чтобы выйти")
            readln()
            break
        }
        mercy = CHoise.second
    }
}
