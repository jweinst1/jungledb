package jungledb

/** Top level abstraction for Jungle Node
  *
  */
abstract class Jungle {
	val ref:DB
	def isLeaf():Boolean
	def childIndexes():Array[Long]
}

case class JungleInt(val value:Int) extends Jungle {

}

case class JungleBool(val value:Boolean) extends Jungle {
	
}

case class JungleString(val value:String) extends Jungle {
	
}