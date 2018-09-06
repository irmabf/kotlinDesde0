class BlackDungeonDragon: DarkDragon() {
  //BlackDungeonDragon can access the reincarnate procteted method because BlackDungeonDragon is a subclass of DarkDragon, which
  //contains this protected method
  fun sacrifice(): Dragon {
    return  reincarnate()
  }

  override  fun reincarnate(): Dragon {
    return IceDragon()
  }
}