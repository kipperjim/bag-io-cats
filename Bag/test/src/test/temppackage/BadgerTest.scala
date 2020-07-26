package test.temppackage

import main.scala.temppackage.Badger
import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers

class BadgerTest extends AnyFunSuite with Matchers {
  test("doubleString"){
    Badger.doubleString("echo") mustBe("echoecho")
  }
}
