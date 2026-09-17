fun Mercy(mercy: Int): Boolean {
    if (mercy >= 7) {
        println("вы добрый, дракон вас отпустил, нажмите enter чтобы выйти")
        readln()
        return false
    }
    return true
}
