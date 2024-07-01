object MeanOfNum {
	

def mean(num1:Int,num2:Int):Double={

  var sum=num1+num2;
  var avrg=sum/2.00;
  BigDecimal(avrg).setScale(2,BigDecimal.RoundingMode.HALF_UP).toDouble;
    
  }

  def main(args: Array[String]): Unit = {
    var num1=10;
    var num2=20;
    var result=mean(num1,num2);
      println(s"number 1 : $num1");
      println(s"number 2 : $num2");
      println(f"Arithmetic Mean : $result%.2f");

}
}