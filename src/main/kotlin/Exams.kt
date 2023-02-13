package Exams

open class Exams (){
    var subject: String = "Undefined"
    var exdate = "01/01/2000"
    var grade: UByte = 2u
    var place = "none"

    constructor(_subject: String) : this() {
        subject = _subject
    }

    constructor(_subject: String, _exdate: String) : this(_subject) {
        exdate = _exdate
    }

    constructor(_subject: String, _exdate: String, _grade: UByte) : this(_subject, _exdate) {
        grade = _grade
    }

    open fun getExamInfo() {
        println("Date of $subject exam is $exdate")
    }
}