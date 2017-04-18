package com.erice.scala.sngl

//生命类时候在类名后加private隐藏类的构造函数，然后定义业务方法
class TestSngl private {
  var name: String = "testSngl"

  def printInfo()= {
    println("TestSngl name:" + name)
  }
}

//半生对象定义类静态常量（半生对象所有的变量都是静态的），定义instance方法返回静态常量。
object TestSngl {
  val testSngl = new TestSngl

  def instance() = testSngl
}

object TestMain {

  def main(args: Array[String]): Unit = {

    // same object
    var testSngl = TestSngl.instance
    var testSngl2= TestSngl.instance
    testSngl.name="liuhao"
    testSngl2.name="nicole"
    testSngl.printInfo()
    testSngl2.printInfo()
  }
}
