package Newspaper
open class Newspaper (_name: String) {
    var name = _name
    var number: UInt = 0u
    var rdate = "01/01/200"
    var count = 1u

    constructor(_name: String, _number: UInt) : this(_name) {
        number = _number
    }

    constructor(_name: String, _number: UInt, _rdate: String) : this(_name, _number) {
        rdate = _rdate
    }
    constructor(_name: String, _number: UInt, _rdate: String, _count: UInt) : this(_name, _number,_rdate) {
        count = _count
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
