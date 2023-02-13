import Newspaper.*

class postOffice() : Newspaper() {
    var length: UInt = 0u
    var cost: Double = 0.0

    constructor(_length: UInt) : this() {
        length = _length
    }

    constructor(_length: UInt, _cost: Double) : this(_length) {
        cost = _cost
    }

    fun getNewspaperCost() {
        if (cost == 0.0) {

            if (number > 10u && number < 200u) {
                cost = 5.0
                println("Name: $name\nCost: $cost")
            }
            else if (number > 200u && number < 600u) {
                cost = 8.35
                println("Name: $name\nCost: $cost")
            }
            else if (number > 600u && number < 700u) {
                cost = 6.75
                println("Name: $name\nCost: $cost")
            }
        }
    }

    fun getNewspaperInfo() {
        if (number > 10u && number < 100u) {
            println("Name: $name\nRelease date: $rdate\nType: Quick News\nCost: $cost")
        } else if (number > 100u && number < 200u) {
            println("Name: $name\nRelease date: $rdate\nType: Weekly News\nCost: $cost")
        } else if (number > 200u && number < 300u) {
            println("Name: $name\nRelease date: $rdate\nType: Political News\nCost: $cost")
        } else if (number > 300u && number < 400u) {
            println("Name: $name\nRelease date: $rdate\nType: Sport News\nCost: $cost")
        } else if (number > 400u && number < 500u) {
            println("Name: $name\nRelease date: $rdate\nType: IT News\nCost: $cost")
        } else if (number > 500u && number < 600u) {
            println("Name: $name\nRelease date: $rdate\nType: Global News\nCost: $cost")
        } else if (number > 600u && number < 700u) {
            println("Name: $name\nRelease date: $rdate\nType: Hybrid News\nCost: $cost")
        }
    }


}