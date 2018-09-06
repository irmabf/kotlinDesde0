abstract class Dragon {

  fun fly() {
    println("\\*/ -*- \\*/ -*-")
  }
  fun roar() {
    println("Rawwwrrrr")
  }

  abstract  fun attack()

  fun <DRAGON_TYPE: Dragon> armyAttack(army: List<DRAGON_TYPE>){
    for (dragon in army){
      dragon.attack()
    }
  }
}