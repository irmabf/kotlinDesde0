open class DarkDragon: Dragon() {
  override fun attack() {
   println("Dark storm!!!!")
  }

  //Only the subclasses can access a protected method
  open protected  fun reincarnate(): Dragon{
    return  DarkDragon()
  }
}