import Exams.*
import Newspaper.*

fun main () {
    println("Введите имя (код) студента, Предмет экзамена (код), Дату (01/01/2000), Оценку")
    var student: Exams = Exams(readln(), readln(), readln(), readln().toUByte())
    student.getExamMark()
    student.getExamInfo()
    student.getStudentExam()

    println("Введите название выпуска, номер, дату (01/01/2000)")
    var AnnaTimes: Newspaper = Newspaper(readln(), readln().toUInt(), readln())
    AnnaTimes.getNewspaper()
    AnnaTimes.getNewspaperDate()
    AnnaTimes.getLatestNewspaper()
}