object MainClass {
  def main(args: Array[String]): Unit = {
    val l = List("a", "b", 3, 4, 10, 20).filter{
      case _:String => true
      case _ => false
    }


     val a = Array(1,2,3,3,4)
    val b = a.sorted.distinct.size
    println(b)
  }
}
