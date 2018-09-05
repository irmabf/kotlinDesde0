//Person(name: String) is the primary constructor

class Person(name: String) : Organism(name){
    //Secondary constructor
    constructor(name: String, lastname: String) : this(name)

    fun greeting(to: String) : String {
        return "Hello $to, my name is $name \n"
    }
}

