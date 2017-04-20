package com.erice.scala.objandclass

/**
  * Created by ericliu on 2017/4/18.
  */
class Person {
  //属性默认Public
  var name: String = _
  var addr: String = _
  var age: Int = _
  
  //默认的构造器
  def this(name: String, addr: String, age: Int) = {
    this()
    this.name = name
    this.addr = addr
    this.age = age
  }

  //override一定加
  override def toString: String = name + "@" + age + "@" + addr

  def apply(){
    println("==call class apply==")
  }
}


//all props is static in object
object Person {
  var name = "liuhao"
  val age = 10
  private var addr = "beijing"

  def apply(){
    println("==call object apply==")
  }
}

object TestMain {
  def main(args: Array[String]): Unit = {
    //println(Person.addr)//error addr ins private
    //Person.age=11 //error beacause Persion.age(val) is constats
    println(Person.name + " age: " + Person.age)
    Person.name = "eriliu"
    println("==after==" + Person.name + " age: " + Person.age)

    var p = new Person()
    p = new Person("nicole", "fengtai hongye", 32)

    p()
    Person()

    println(p.toString)
    println(p.name)
  }
}