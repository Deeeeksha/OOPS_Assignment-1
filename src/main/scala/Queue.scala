import scala.collection.mutable.ListBuffer
trait Queue{
  def enqueue(list: ListBuffer[Int]): Unit = {
    val num = 50
    list.addOne(num)

  }
  def dequeue( list: ListBuffer[Int]): Unit = {

  list.remove(0)
  }
}
