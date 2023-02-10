package Exams

//import java.sql.Date

open class Exams (_studentname: String){
    val studentname = _studentname
    var subject:String = "Undefined"
    var exdate = "01/01/2000"
    var grade:UByte = 2u

    constructor(_studentname: String, _subject: String): this(_studentname){
        subject = _subject
    }
    constructor(_studentname: String, _subject: String, _exdate: String): this(_studentname, _subject){
        exdate = _exdate
    }
    constructor(_studentname: String, _subject: String, _exdate: String, _grade: UByte): this(_studentname, _subject, _exdate){
        grade = _grade
    }
    open fun getExamInfo() {
        println("Date of $subject exam is $exdate")
    }
    open fun getExamMark() {
        println("$studentname has a grade of $grade on the $subject exam")
    }
    open fun getStudentExam() {
        println("$studentname has a $subject exam")
    }
}