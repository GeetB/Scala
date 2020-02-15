package fileoperation

/*
   A simple scala program which read data from given source file path and print one line at a time on the console
 */
object csvfileReaderMain extends App {

  println("Reading CSV File ....")

  val fileReader = scala.io.Source.fromFile("input_data/dummy_data.csv")

  for(line <- fileReader.getLines){
    println(line)
  }


}
