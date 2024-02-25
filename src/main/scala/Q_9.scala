object Q_9 {
  def main(args:Array[String]):Unit = {
//    Question 9: Write a Scala function to find the second smallest element in an array of integers.
var a  = Array(15,6,7,8,9)
    var smallest_e = a(0)


    for (i<- 0 until a.length){
      if (a(i)<smallest_e){
        smallest_e = a(i)
      }
    }
    println(smallest_e)

  }
}
