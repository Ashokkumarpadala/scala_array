object Q_6 {
  def main(args:Array[String]):Unit = {
//    Question 6: Write a Scala function to find the average of elements in an array of integers.

    var a = Array(1,2,3,4,5,6,7,8,9)
    var count = 0
    for (i<- 0 until a.length){
      count = count +a(i)
    }
    println(count/2)
  }

}
