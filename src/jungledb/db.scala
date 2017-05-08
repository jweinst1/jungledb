package jungledb

import java.io.RandomAccessFile

/** Contains methods to read and write from a DB file with a functional approach
  *
  */
class DB(path:String) {
	
}


object DBConsts {
	val newHead:Array[Byte] = Array(77, 66, 0);
}