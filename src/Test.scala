import scala.collection.mutable.ArrayBuffer

/**
  * Created by tangfei on 2016/10/31.
  */
object Test {
  def main(args: Array[String]) {
    /*    val b: ArrayBuffer[Int] = ArrayBuffer[Int]()
        b += 1

        b += (1,2,3,5)

        b ++= Array(8,13,21)

        b.trimEnd(5)
        b.insert(2,6)
        b.insert(2,7,8,9)
        b.remove(2)
        b.remove(2,3)
        println(b)

        for (i <-0 until b.length) {
          println(i+":"+b(i))
        }
        for (i <-0 until (b.length,2)) {
          println(i+":"+b(i))
        }
        for (i <- (0 until b.length).reverse) {
          println(i+":"+b(i))
        }
        for (elem <- b) {
          println(elem)
        }



        b.toArray*/

    val a: Array[Int] = Array(2, 3, 5, 7, 11)
    val result: Array[Int] = for (elem <- a ) yield  2*elem

    for(elem <- a){
      print(elem)
      print(",")
    }
    println()
    for(elem <- result) {
      print(elem)
      print(",")
    }
    println()

    val result2: Array[Int] = for (elem <- a  if elem%2==0 ) yield  2*elem
    for(elem <- result2){
      print(elem)
      print(",")
    }

    println()

    val result3: Array[Int] = a.filter(_ % 2==0).map(2 * _)

    for(elem <- result3) {
      print(elem)
      print(",")
    }

    println()

    val bb: Array[Int] = Array[Int](-1,2,3,-4)

    var first = true
    val indexex = for(i<-0 until bb.length if first || a(i) >=0) yield {
      if(a(i)<0)  first=false;i
    }
    for (elem <- indexex){
      print(elem)
    }

    println()

    val bbb = ArrayBuffer(1,7,2,9)
    val sorted: ArrayBuffer[Int] = bbb.sorted
    for (elem <- sorted){
      print(elem)
    }


  }


}
