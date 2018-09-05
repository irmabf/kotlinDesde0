fun main(args: Array<String>) {
  //lambda
  val greeting: (String) -> Unit = {name ->
    print("Hello World, $name")
  }
  //invoke lambda
  greeting.invoke("Lord Snow")
}