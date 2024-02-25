object Q_10 {
  def main(args:Array[String]):Unit = {
  print(ascending())
  }


  def ascending():Boolean = {
//    Question 10: Create a Scala function to check if an array is sorted in ascending order.
    var a = Array(1,2,3,4,5,6)
    for(i<- 0 until a.length-1){
      if (a(i)>a(i+1)){
        return false

      }
    }
 true
  }

}
