package edem

class Old(var how_old: String, var length: UInt, var summary: String, var cost: UInt) {
    fun gazeta() {
        println("Возраст газеты целых $how_old размера $length")
    }

    fun getContext() {
        if (summary != "") {
            println("Краткое содержание: $summary")
        } else summary = "No data"
    }

    fun getCost() {
        if (cost != 0u) {
            if (length < 100u) cost = 10u
            else if (length >= 100u && length < 500u) cost = 30u
            else if (length >= 500u && length < 1000u) cost = 50u
        }
    }

}

class New(var how_young: String, var length: UInt, var summary: String, var cost: UInt) {
    fun gazeta() {
        println("Возраст газеты всего $how_young размера $length")
    }

    fun getContext() {
        if (summary != "") {
            println("Краткое содержание: $summary")
        } else summary = "No data"
    }

    fun getCost() {
        if (cost != 0u) {
            if (length < 100u) cost = 10u
            else if (length >= 100u && length < 500u) cost = 30u
            else if (length >= 500u && length < 1000u) cost = 50u
        }
    }
}