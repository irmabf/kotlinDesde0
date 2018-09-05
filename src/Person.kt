//Person(name: String) is the primary constructor

class Person(name: String) : Organism(name){
    //Secondary constructor
    constructor(name: String, lastname: String) : this(name)

    fun greeting() {
        print("Hello world, my name is $name \n")
    }
}

