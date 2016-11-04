package implicitc

import java.io.File
import implicitc.FileUtils._

/**
  * Created by tangfei on 2016/11/4.
  */
object Main extends App{
  //隐式类
  val file: File = new File(getClass.getResource("/").getPath+"file.txt")
  file.lines foreach  println

  //隐式转换为目标类型：把一种类型自动转换到另一种类型
  def foo(msg:String) = println(msg)
  implicit def intToString(x:Int) = x.toString
  foo(10)



}
