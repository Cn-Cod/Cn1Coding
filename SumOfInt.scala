object SumOfInt {
  
   
  def SumOfInt(list: List[Int]):Int= {
list.filter(_ % 2 == 0).sum
     }

  def main(args: Array[String]): Unit = {
var list=List(10,20,30,40,50);


  var sum=SumOfInt(list);

  println(s"integer List: $list");
  println(s"Sum of Numbers: $sum");
	
}
}