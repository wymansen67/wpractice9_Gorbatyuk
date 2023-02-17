import Exams.*
class neobyazatelnii (_subject: String) : Exams (_subject)  {
    var max_score: UByte = 100u
    var pass_score: UByte = 45u
    var admisson: Boolean = false
    var attempts: UByte = 3u

    fun getAdmisson() {
        if (debts == "Да" || debts == "Yes" ) admisson = false
        else if (debts == "Нет" || debts == "No") admisson = true
    }

    fun getStudentGrade() {
        if (admisson == false) {

            if (score == max_score) {
                success = "Passed. Max score"
                grade = 5u
            } else if (score >= pass_score && score < 60u) {
                success = "Passed"
                grade = 3u
            } else if (score >= 60u && score < 85u) {
                success = "Passed"
                grade = 4u
            } else {
                success = "Failed"
                grade = 2u
            }
        }
    }

    fun getExamRetake() {
        if (success == "Failed"){
            if (day + 7u > 31u){
                day = (day - 31u + 7u).toUByte()
                if (month++ > 12u){
                    month = 1u
                    this.year++
                    println("Your retake date is $day/$month/$year")
                }
                else this.month++
                println("Your retake date is $day/$month/$year")
            }
            else println("Your retake date is $day/$month/$year")
        }
    }
}