object Q_8 {
  def main(args:Array[String]):Unit = {
//    Question 8: Given an array of integers, write a Scala function to remove all the even numbers from
var a = Array(1,2,3,4,5,6,7,8,9)
    var b = Array[Int]()
    for (i<- 0 until a.length){
      if (a(i)%2!=0) {
        b = b :+ a(i)
      }
    }


  }

}
