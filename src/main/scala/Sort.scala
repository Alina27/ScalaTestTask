class Sort[A] (val list: List[A]) {

  val elements: List[A] = list

  def lessThen(a: Int, b: Int): Boolean = {
    if(a < b)
      true
    else false
  }

  //Here like Java won't work
  /*def sort():List[A] = {

    val len: Int = elements.length

    for(i <- 0 until len-1){
      var min  =  i

      for(j <- i+1 to len) {
        if(lessThen(elements(j).asInstanceOf[Int], elements(min).asInstanceOf[Int]) )
          min = j

        val temp = elements(min)
        elements(min) = elements(i)
        elements(i) = temp
      } //first for
    } // second for
    elements
  }*/
  def sort():List[A] = ???
}

object Sort {
  def main(args: Array[String]): Unit = {

    val elems: List[Int] = List(5,7,13,18,44,86)

    val sortInts = new Sort[Int](elems)
    println(sortInts.sort())

  }
}
