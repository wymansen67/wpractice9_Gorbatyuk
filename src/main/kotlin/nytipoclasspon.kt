package vottipoklaas

class Math(
    var pass_score: UByte,
    var info: String,
    var max_score: UByte,
    var debts: Boolean,
    var admisson: Boolean,
    var pass: String,
    var score: UByte
) {
    fun udacha() {
        println("Ну короче надо $pass_score для получения $info")
    }

    fun getPass() {
        if (score <= max_score || score > pass_score) {
            pass = "Молодец блин. Сдал. Чтоб больше я тебя здесь не видел."
        } else pass = "Плохо блин. Не сдал. Прибегай еще."
    }

    fun getAdmission() {
        if (!debts) admisson = true
        else admisson = false
    }
}

class Rusish(
    var pass_score: UByte,
    var info: String,
    var max_score: UByte,
    var debts: Boolean,
    var admisson: Boolean,
    var pass: String,
    var score: UByte
) {
    fun udacha() {
        println("Ну короче надо $pass_score для получения $info")
    }

    fun getPass() {
        if (score <= max_score || score > pass_score) {
            pass = "Молодец блин. Сдал. Чтоб больше я тебя здесь не видел."
        } else pass = "Плохо блин. Не сдал. Прибегай еще."
    }

    fun getAdmission() {
        if (!debts) admisson = true
        else admisson = false
    }
}