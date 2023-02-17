package edem
class Old (var how_old:String, var how_long:UInt ) {
    fun gazeta () {
        println("Возраст газеты всего $how_old размера $how_long")
    }
}
class New (var how_young:String, var how_long:UInt ) {
    fun gazeta () {
        println("Возраст газеты всего $how_young размера $how_long")
    }
}