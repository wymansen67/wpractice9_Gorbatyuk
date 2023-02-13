package Newspaper
open class Newspaper () {
    var name = "Undefined"
    var number: UInt = 0u
    var rdate = "01/01/200"

    constructor(_name: String): this(){
        name = _name
    }
    constructor(_name: String, _number: UInt) : this(_name) {
        number = _number
    }

    constructor(_name: String, _number: UInt, _rdate: String) : this(_name, _number) {
        rdate = _rdate
    }

    open fun getLatestNewspaper() {
        println("The latest newspaper was released in $rdate")
    }

    open fun getNewspaper() {
        println("Newspaper №$number named $name")
    }

    open fun getNewspaperDate() {
        println("Newspaper №$number released $rdate")
    }
}
