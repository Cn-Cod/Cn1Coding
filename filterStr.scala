object filterStr {
	
  
def filterStr(strings: List[String]): List[String] = {
strings.filter(_.length > 5)

}

def main(args: Array[String]): Unit = {

 var list=List("Hello","Program","Apple","Orange","Sky","Blue");
 var result=filterStr(list);

  println(list);

  println(s"Filtered List: $result");
	
}
}