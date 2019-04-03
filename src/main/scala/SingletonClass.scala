class SingletonClass private() {

  val item: Int = 0

  def addOne(): Int = {
    item + 1
  }

}

object SingletonClass {

  private var singleInstance: SingletonClass = null

  //def getSingleInstance() = singleInstance

  def getSingleInstance(): Unit = {
    if(singleInstance == null)
      singleInstance = new SingletonClass()
    else singleInstance
  }

  def main(args: Array[String]): Unit = {
    val myItem = new SingletonClass()
    println(myItem.addOne())

  }

}



