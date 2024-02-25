object Q_7 {
  def main(args:Array[String]): Unit ={
//    Question 7: Implement a Scala function to check if a given array of strings contains a specific string.
var a = Array("Ashok","is","a","solid","Data","Engineer")

var specific_str = scala.io.StdIn.readLine("enter string")
    for (i<- 0 until a.length){
      if (a(i)==specific_str){
        println(s"$specific_str is present in Array")

      }

    }
  }
}
