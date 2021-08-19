import scala.collection.mutable.ListBuffer

object CheckQueue{
  def main(args:Array[String]): Unit = {

    val listOfElements= ListBuffer(2,12,1,4,6,8,7,22,25)
    println(listOfElements)
    val s = new DoubleQueue(listOfElements)

    s.dequeue(listOfElements)
    println(listOfElements)
    s.enqueue(listOfElements)
    println(listOfElements)

    new SquareQueue(listOfElements)
    println(listOfElements)

  }
}
