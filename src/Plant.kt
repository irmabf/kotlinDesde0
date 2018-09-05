class Plant(name: String) : Organism(name) {
  override fun eat() {
    print("Photosyntesis!\n")
  }
}