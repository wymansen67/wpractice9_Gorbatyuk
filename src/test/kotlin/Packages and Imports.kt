import Exams.*
import Newspaper.*
import educationalinstitution.*

fun main() {
    /*
    println("Введите имя (код) студента, Предмет экзамена (код), Оценку, Дату (01/01/2000)")
    var student: Exams = Exams(readln(), readln(), readln().toUByte())
    var studentname: educationalinstitution = educationalinstitution(readln())
    studentname.getExamMark()
    student.getExamInfo()
    studentname.getStudentExam()
    */
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