import Exams.*
open class educationalinstitution () : Exams() {
    var student = "Undefined"

    constructor(_student: String): this(){
        student = _student
    }
    open fun getExamMark() {
        println("$student has a grade of $grade on the $subject exam")
    }
    open fun getStudentExam() {
        println("$student has a $subject exam")
    }
}