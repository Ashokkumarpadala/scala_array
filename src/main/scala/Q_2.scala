object  Q_2 {
  def main(args:Array[String]):Unit = {
// Question 2: Given an array of integers, write a Scala function to find the sum of all elements in the
//    array.
var a  = Array(1,2,3,4,5)
    var sum = 0
    for (i<- 0 until a.length){
      sum = sum+a(i)
    }
    println(sum)

  }

}
