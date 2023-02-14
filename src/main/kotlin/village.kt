import Newspaper.*

class village() : Newspaper(readln()) {
    var length: UInt = 0u
    var cost: Double = 0.0

    constructor(_length: UInt) : this() {
        length = _length
    }

    fun getNewspaperCost() {
        if (count == 1u) {
            if (number > 10u && number < 200u) {
                cost = 3.75
                println("Name: $name\nCost: $cost")
            } else if (number > 200u && number < 600u) {
                cost = 6.95
                println("Name: $name\nCost: $cost")
            } else if (number > 600u && number < 700u) {
                cost = 5.25
                println("Name: $name\nCost: $cost")
            }
        } else if (count > 1u) {
            if (number > 10u && number < 200u) {
                cost = 3.75 * count.toDouble()
                println("Name: $name\nCost: $cost")
            } else if (number > 200u && number < 600u) {
                cost = 6.95 * count.toDouble()
                println("Name: $name\nCost: $cost")
            } else if (number > 600u && number < 700u) {
                cost = 5.25 * count.toDouble()
                println("Name: $name\nCost: $cost")
            }
        }
    }

    fun getNewspaperInfo() {
        if (number < 10u || number > 800u){
            println("Incorrect type.\nSelecting default type")
            number = 10u
            getNewspaperInfo()
        }
        else {
            if (number >= 10u && number < 100u) {
                println("Name: $name\nRelease date: $rdate\nType: Quick News\nCost: $cost")
            } else if (number >= 100u && number < 200u) {
                println("Name: $name\nRelease date: $rdate\nType: Weekly News\nCost: $cost")
            } else if (number >= 200u && number < 300u) {
                println("Name: $name\nRelease date: $rdate\nType: Political News\nCost: $cost")
            } else if (number >= 300u && number < 400u) {
                println("Name: $name\nRelease date: $rdate\nType: Sport News\nCost: $cost")
            } else if (number >= 400u && number < 500u) {
                println("Name: $name\nRelease date: $rdate\nType: IT News\nCost: $cost")
            } else if (number >= 500u && number < 600u) {
                println("Name: $name\nRelease date: $rdate\nType: Global News\nCost: $cost")
            } else if (number >= 600u && number < 700u) {
                println("Name: $name\nRelease date: $rdate\nType: Hybrid News\nCost: $cost")
            }
        }
    }

    fun getNewestNewspaper() {
        if (number > 10u && number < 100u) {
            println("Release date: $rdate\nType: Quick News")
        } else if (number > 100u && number < 200u) {
            println("Release date: $rdate\nType: Weekly News")
        } else if (number > 200u && number < 300u) {
            println("Release date: $rdate\nType: Political News")
        } else if (number > 300u && number < 400u) {
            println("Release date: $rdate\nType: Sport News")
        } else if (number > 400u && number < 500u) {
            println("Release date: $rdate\nType: IT News")
        } else if (number > 500u && number < 600u) {
            println("Release date: $rdate\nType: Global News")
        } else if (number > 600u && number < 700u) {
            println("Release date: $rdate\nType: Hybrid News")
        }
    }
}