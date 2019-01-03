package ua.mackenzy.codility.RectangleBuilderGreaterArea

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

class SolutionFightSpec extends FlatSpec with Matchers {

  "Solutions" should "fight" in {
    (0 until 100000).foreach { _ =>
      val size = Random.nextInt(100) + 1

      val a = Array.fill(size)(Random.nextInt(20) + 1)
      val x = Random.nextInt(20) + 1
      var n1 = 0
      var n2 = 0

      try {
        n1 = Solution.solution(a, x)
        n2 = Solution2.solution(a, x)

        n1 should equal(n2)
      } catch {
        case t: Throwable =>
          println(s"source: ${a.toList.toString} x:$x")
          println(s"s1: $n1 s2: $n2")
          throw t
      }
    }
  }

  it should "big fight" in {
    (0 until 100).foreach { _ =>
      val size = Random.nextInt(100000) + 1

      val a = Array.fill(size)(Random.nextInt(1000000000 - 1) + 1)
      val x = Random.nextInt(1000000000 - 1) + 1
      var n1 = 0
      var n2 = 0

      try {
        n1 = Solution.solution(a, x)
        n2 = Solution2.solution(a, x)

        n1 should equal(n2)
      } catch {
        case t: Throwable =>
          println(s"source: ${a.toList.toString} x:$x")
          println(s"s1: $n1 s2: $n2")
          throw t
      }
    }
  }

}
