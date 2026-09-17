fun RandomPotion(hpPlayer: Int): Int {
    var HpPlayer = hpPlayer
    if (hpPlayer == 100) {
        println("вы нашли зелье, но вы здоровы")
    } else {
        HpPlayer = (hpPlayer + 30).coerceAtMost(100)
        println("вы нашли зелье, ваше здоровье: $hpPlayer")
    }
    return HpPlayer
}
