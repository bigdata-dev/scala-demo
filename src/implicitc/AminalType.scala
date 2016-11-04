package implicitc

/**
  * Created by tangfei on 2016/11/4.
  * 隐式转换调用类中本不存在的方法
  * 通过隐式转换，使对象能调用类中本不存在的方法
  *
  * 编译器在rabbit对象调用时发现对象上并没有wantLearning方法，
  * 此时编译器就会在作用域范围内查找能使其编译通过的隐式视图，
  * 找到learningType方法后，编译器通过隐式转换将对象转换成具有这个方法的对象，之后调用wantLearning方法
  */
class SwingType{
  def  wantLearned(sw : String) = println("兔子已经学会了"+sw)
}
object swimming{
  implicit def learningType(s : AminalType) = new SwingType
}
class AminalType
object AminalType extends  App{
  import implicitc.swimming._
  val rabbit = new AminalType
  rabbit.wantLearned("breaststroke")         //蛙泳
}