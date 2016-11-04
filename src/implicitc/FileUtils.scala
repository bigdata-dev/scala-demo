package implicitc

import java.io.{BufferedReader, File, FileReader}

/**
  * Created by tangfei on 2016/11/4.
  * 隐式类：
  * 在scala2.10后提供了隐式类，可以使用implicit声明类，但是需要注意以下几点：
  * 1.其所带的构造参数有且只能有一个
  * 2.隐式类必须被定义在类，伴生对象和包对象里
  * 3.隐式类不能是case class（case class在定义会自动生成伴生对象与2矛盾）
  * 4.作用域内不能有与之相同名称的标示符
  */
object FileUtils {
  //隐式类
  implicit class Files(file: File) {
    def lines: Array[String] = {
      val fileReader: FileReader = new FileReader(file)
      val reader = new BufferedReader(fileReader)
      try {
        var lines = Array[String]()
        var line = reader.readLine()

        while (line != null) {
          lines = lines :+ line
          line = reader.readLine()
        }
        lines
      } finally {
        fileReader.close()
        reader.close()
      }
    }
  }
}
