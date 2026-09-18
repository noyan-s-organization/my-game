fun controller() {
    var exit = true
    var mercy = 4
    var hpPlayer = 100
    val damagePlayer = 15
    val damageDragon = 32
    var hpDragon = 200
    while (exit) {
        val Exit = Mercy(mercy)
        if (Exit == 101) break
        val randomPotion = (1..80).random()
        if (randomPotion == 1) {
            hpPlayer = RandomPotion(hpPlayer)
        }
        val dragonStrike = (1..mercy).random()
        if (dragonStrike == 1) {
            hpPlayer = dragonStrike(dragonStrike, hpPlayer, damageDragon)
            if (hpPlayer == 0) {
                println("вы проиграли, нажмите enter чтобы выйти")
                readln()
                break
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
