object Q_4 {
  def main(args:Array[String]):Unit = {
//    Question 4: Write a Scala function to find the maximum element in an array of doubles.
var a  = Array(15,6,7,8,9)
    var smallest_e = a(0)


    for (i<- 0 until a.length){
      if (a(i)>smallest_e){
        smallest_e = a(i)
      }
    }
    println(smallest_e)
  }

}
