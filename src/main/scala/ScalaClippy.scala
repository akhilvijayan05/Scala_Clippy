/**
  * Created by knoldus on 3/8/17.
  */
object ScalaClippy extends App{

  val list = List(List(1, 2), List(3, 4))
  list.flatmap(x => x)
}
