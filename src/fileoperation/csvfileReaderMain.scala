package fileoperation

/*
   A simple scala program which read data from given source file path and print one line at a time on the console
 */
object csvfileReaderMain extends App {

  plainRead("input_data/dummy_data.csv")
  println()
  plainReadWithoutHeader("input_data/dummy_data.csv")

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
    for (line <- fileReaderWithoutHeader.getLines.drop(1)){
      println(line)
    }
  }

}


