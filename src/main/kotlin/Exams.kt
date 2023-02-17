package Exams

open class Exams(_subject: String) {
    var studentname: String = "Undefined"
    var subject: String = _subject
    var day: UByte = 1u
    var month: UByte = 1u
    var year: UInt = 2000u
    var score: UByte = 0u
    open var success = "None"
    open var grade: UByte = 0u
    var debts: String = "No";

    constructor(_subject: String, _studentname: String) : this(_subject) {
        studentname = _studentname
    }

    constructor(_subject: String, _studentname: String, _day: UByte, _month: UByte, _year: UInt) : this(
        _subject,
        _studentname
    ) {
        day = if (_day in 1u..31u) _day else 1u
        month = if (_month in 1u..31u) _month else 1u
        year = if (_year in 2000u..2050u) _year else 2000u
    }

    constructor(_subject: String, _studentname: String, _day: UByte, _month: UByte, _year: UInt, _score: UByte) : this(
        _subject,
        _studentname,
        _day,
        _month,
        _year
    ) {
        score = _score
    }

    constructor(
        _subject: String,
        _studentname: String,
        _day: UByte,
        _month: UByte,
        _year: UInt,
        _score: UByte,
        _debts: String
    ) : this(_subject, _studentname, _day, _month, _year, _score) {
        debts = if (debts == "Yes" || debts == "No" || debts == "Да" || debts == "Нет") _debts
        else "No"
    }

    open fun examInformation() {
        println("Student $studentname takes the exam on $day/$month/$year.")
    }

    open fun examSubject() {
        println("Student $studentname passes $subject.")
    }
}