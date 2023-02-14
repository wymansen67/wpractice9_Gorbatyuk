import Exams.*
import Newspaper.*
import educationalinstitution.*

fun main () {
    println("Введите имя (код) студента, Предмет экзамена (код), Дату (01/01/2000), Оценку")
    var student: Exams = Exams(readln(), readln(), readln().toUByte())
    var studentname: educationalinstitution = educationalinstitution(readln())
    studentname.getExamMark()
    student.getExamInfo()
    studentname.getStudentExam()

    println("Введите название выпуска, номер, дату (01/01/2000), длину выпуска, цену")
    var AnnaTimes: Newspaper = Newspaper(readln(), readln().toUInt(), readln())
    var AnnaTimesPost: postOfficeCity = postOfficeCity(readln().toUInt(), readln().toDouble())
    AnnaTimes.getNewspaper()
    AnnaTimes.getNewspaperDate()
    AnnaTimes.getLatestNewspaper()
    AnnaTimesPost.getNewspaperCost()
    AnnaTimesPost.getNewspaperInfo()
    var AnnaTimesPostVllg: postOfficeVillage = postOfficeVillage(readln().toUInt(), readln().toDouble())
    AnnaTimes.getNewspaper()
    AnnaTimes.getNewspaperDate()
    AnnaTimes.getLatestNewspaper()
    AnnaTimesPostVllg.getNewspaperCost()
    AnnaTimesPostVllg.getNewspaperInfo()

}