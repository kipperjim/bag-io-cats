import mill._, scalalib._

object Bag extends ScalaModule {
  def scalaVersion = "2.13.3"

  object test extends Tests {
    def ivyDeps = Agg(
      ivy"org.scalactic::scalactic:3.2.0",
      ivy"org.scalatest::scalatest:3.2.0"
    )
    def testFrameworks = Seq("org.scalatest.tools.Framework")
  }
}