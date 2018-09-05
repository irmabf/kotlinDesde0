//Person(name: String) es el constructor primario
class Person(name: String) {

    //Atributos de clase
    var name: String

    //constructor secundario con nombre y apellido
    constructor(name: String, lastname: String) : this(name)

    //Init se ejecuta siempre que se ejecuta el constrctor primario
    init {
        //this.name es la variable de clase, atributo de clase y name, lo que asignamos, es el nombre que nos pasan al inicializar la instancia del constructor
        this.name = name
        print("Born")
    }

    fun greeting() {
        print("Hello world, my name is  ${name}")
    }
}