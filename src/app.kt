fun main(args: Array<String>) {
  //lambda
  val greeting: (String) -> Unit = {name ->
    print("Hello World, $name")
  }
  //invoke lambda
  greeting.invoke("Lord Snow")


  val drogon: FireDragon = FireDragon()
  val rhaegal: FireDragon = FireDragon()
  val viserion: IceDragon = IceDragon()

  val daenerysArmy: List<FireDragon> = listOf<FireDragon>(drogon, rhaegal)

  val nightKingArmy: List<IceDragon> = listOf<IceDragon>(viserion)

  val xin = RedMountainDragon()

  xin.attack()

  drogon.armyAttack(daenerysArmy)
  rhaegal.armyAttack(nightKingArmy)



}