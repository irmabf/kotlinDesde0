class RedMountainDragon: FireDragon() {
  override fun attack() {
    super.attack()
    rainOfFire()
  }
  //Only the class can access a private method
  private  fun rainOfFire(){
    println("The droplets are on fire!!!!")
  }
}