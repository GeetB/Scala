package fileoperation

/*
   Author - Geet Bhalshankar
   Description :
   A simple scala program  to :
   1. Read data from csv file including header
   2. Read data from csv file excluding/dropping header
   3. Read data from URL
 */
object csvfileReaderMain extends App {
  plainRead("input_data/dummy_data.csv")
  println()
  plainReadWithoutHeader("input_data/dummy_data.csv")
  println()
  plainReadFromURL("https://en.wikipedia.org/wiki/Apache_Hadoop")

  // Reading a file containing header
  def plainRead(path:String) : Unit = {
    println("Simple Reading CSV File, One line at a time ....")
    val fileReader = scala.io.Source.fromFile(path)
    for(line <- fileReader.getLines){
      println(line)
    }
  }

  //Reading a file and exclude header while reading it
  def plainReadWithoutHeader(path:String) : Unit = {
    println("Read a CSV file while excluding header .....")
    val fileReaderWithoutHeader = scala.io.Source.fromFile(path)
    for (line <- fileReaderWithoutHeader.getLines.drop(1)) {
      println(line)
    }
  }

  //Reading data from particular URL
  def plainReadFromURL(pathURL: String) : Unit = {
      println("Reading from URL ....")
      val abc = scala.io.Source.fromURL("https://en.wikipedia.org/wiki/Apache_Hadoop")
      for (urlLine <- abc.getLines){
        println(urlLine)
      }
    }

}


