import Newspaper.*

fun main() {

    println("Введите тип (укажите номер)\n1.Городская\n2.Поселковая")
    var temp = readln()
    if (temp == "1") {
        println("Введите название выпуска, номер, дату (01/01/2000), кол-во, длину выпуска")
        var AnnaTimes: Newspaper = Newspaper(readln(), readln().toUInt(), readln(), readln().toUInt())
        var AnnaTimesPost: city = city(readln().toUInt())
        AnnaTimes.getNewspaper()
        AnnaTimes.getNewspaperDate()
        AnnaTimes.getLatestNewspaper()
        AnnaTimesPost.getNewspaperCost()
        AnnaTimesPost.getNewspaperInfo()
    } else if (temp == "2") {
        println("Введите название выпуска, номер, дату (01/01/2000), кол-во, длину выпуска")
        var AnnaTimes: Newspaper = Newspaper(readln(), readln().toUInt(), readln(), readln().toUInt())
        var AnnaTimesPostVllg: village = village(readln().toUInt())
        AnnaTimes.getNewspaper()
        AnnaTimes.getNewspaperDate()
        AnnaTimes.getLatestNewspaper()
        AnnaTimesPostVllg.getNewspaperCost()
        AnnaTimesPostVllg.getNewspaperInfo()
    }

}