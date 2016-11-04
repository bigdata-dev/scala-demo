package implicitc

/**
  * Created by tangfei on 2016/11/4.
  * 将隐式转换函数定义在伴生对象中，在使用时导入隐式视图到作用域中即可
  */
class SwingType{
  def  wantLearned(sw : String) = println("兔子已经学会了"+sw)
}

package swimmingPage{
  object swimming{
    implicit def learningType(s : AminalType) = new SwingType  //将转换函数定义在包中
  }
}
class AminalType2
object AminalType2 extends  App{
  import implicitc.swimmingPage.swimming._  //使用时显示的导入
  val rabbit = new AminalType
  rabbit.wantLearned("breaststroke")         //蛙泳
}