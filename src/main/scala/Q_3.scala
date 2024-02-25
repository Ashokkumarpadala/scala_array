object Q_3 {
  def main(args: Array[String]): Unit = {
    //Question 3: Implement a Scala function to reverse an array of strings.
    var a = Array("ashok","kumar","is","a","solid","data","engineer")
    var c = Array[String]()
    for (i<- a.length-1 to 0 by -1){
      c= c:+a(i)

    }
    println(c)


  }
}
