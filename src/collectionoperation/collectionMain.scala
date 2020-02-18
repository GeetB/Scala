package collectionoperation
/*
    Author : Geet Bhalshankar
    Description :
    This program is to work on different collection in Scala
    1. List
    2. Tuple
    3. Map
 */
object collectionMain extends App {

  // Declaring List and assigning values to list
  val collectionList = List("12","13","40","AAA","bbbb","A210","399")
  //Iterating over the list using for loop
  for ( element <- collectionList) {
    println(element)
  }
  //Iterating over the list using foreach
  collectionList.foreach(x => println(x))

  collectionList.foreach { element =>
    try {
      element.toInt
    } catch  {
        case e: NumberFormatException => "Number Format Exception ....!"
        case _ => "something else"
      }
    }
}

