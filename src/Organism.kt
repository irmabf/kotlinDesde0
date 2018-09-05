open class Organism(val name: String) {
  init {
    print("Born!\n")
  }

  open fun eat() {
    print("Yummy!\n")
  }
}