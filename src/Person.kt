//Person(name: String) is the primary constructor
class Person(var name: String) {

    //Secondary constructor
    constructor(name: String, lastname: String) : this(name)

    init {
        print("Born!\n")
    }

    fun greeting() {
        print("Hello world, my name is $name \n")
    }
}