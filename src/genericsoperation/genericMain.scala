package genericsoperation

/**
 * Author : Geet Bhalshankar
 * Description :
 * This is a demo to showcase the implementation of Generic Class
 * Generic classes take a type as a parameter within square brackets [].
 * In the example below we have used letter A as type parameter identifier. We can use anything else from A to Z as identifier
 *
 */
object genericMain extends App {

  //Creating stack of Integer values
val stackInt = new Stack[Int]
  stackInt.push(1)
  stackInt.push(2)
  stackInt.show()
 // println(stack.pop())

  //Creating stack of String elements
  val stackString = new Stack[String]
  stackString.push("Geet")
  stackString.push("Swara")
  stackString.show()
}

// Defining generic class 
class Stack[A] {
  var elements : List[A] = Nil
  def push(x: A) = {elements = x :: elements}
  def peek : A = elements.head
  def pop() : A = {
    val currentTop = peek
    elements = elements.tail
    currentTop
  }

  def show() : Unit = {
    println(elements)
  }
}