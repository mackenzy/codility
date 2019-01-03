package ua.mackenzy.codility.RectangleBuilderGreaterArea

import org.scalatest.{FlatSpec, Matchers}

import scala.util.Random

class SolutionSpec extends FlatSpec with Matchers {

  "Solution" should "return 2" in {
    val n = Solution.solution(Array(1, 2, 5, 1, 1, 2, 3, 5, 1), 5)
    n should equal(2)
  }

  it should "return 1" in {
    val n = Solution.solution(Array(1, 1, 1, 1, 2, 2, 3, 5, 5), 6)
    n should equal(1)
  }

  it should "return 1 by squares" in {
    val n = Solution.solution(Array(6, 6, 6, 6, 6, 6), 10)
    n should equal(1)
  }

  it should "return 5" in {
    val n = Solution.solution(Array(1, 1, 1, 1, 2, 2, 3, 5, 5, 6, 6), 5)
    n should equal(5)
  }

  it should "return 9" in {
    val n = Solution.solution(Array(1, 1, 1, 1, 2, 2, 3, 5, 5, 6, 6, 7, 7), 5)
    n should equal(9)
  }

  it should "return 11 in 3, 6 intersection and square" in {
    val n = Solution.solution(Array(1, 1, 2, 3, 3, 3, 3, 3, 3, 5, 6, 6, 7, 8, 8, 9, 10, 10, 10, 10), 4)
    n should equal(11)
  }

  it should "return 11 in 2, 3, 5 intersection and square" in {
    val n = Solution.solution(Array(1, 1, 1, 2, 2, 2, 3, 3, 4, 5, 5, 5, 6, 6, 7, 8, 10, 10, 10, 10), 7)
    n should equal(11)
  }

  it should "return 11 in 2, 3, 5, 8 intersection and square" in {
    val n = Solution.solution(Array(1, 2, 2, 2, 3, 3, 3, 4, 5, 5, 5, 5, 6, 8, 8, 8, 8, 9, 9, 10), 9)
    n should equal(11)
  }

  it should "return 13" in {
    val n = Solution.solution(Array(1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 6, 7, 8, 8), 10)
    n should equal(13)
  }

  it should "return 16" in {
    val n = Solution.solution(Array(1, 1, 2, 2, 3, 3, 5, 5, 6, 6, 7, 7, 10, 10), 7)
    n should equal(16)
  }

  it should "return 44" in {
    val n = Solution.solution(Array(1, 1, 2, 2, 4, 4, 8, 8, 8, 8, 16, 16, 32, 32, 64, 64, 128, 128, 256, 256, 512, 512), 8)
    n should equal(44)
  }

  it should "return 57" in {
    val n = Solution.solution(Array(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 10, 10, 12, 12, 15, 15, 16, 16), 10)
    n should equal(57)
  }

  it should "return 0" in {
    val n = Solution2.solution(Array(1, 1, 2, 2, 5, 5, 6, 9, 10, 11, 12, 13, 18), 13)
    n should equal(0)
  }

  it should "return 0 on empty array" in {
    val n = Solution2.solution(Array.empty, 1)
    n should equal(0)
  }

  it should "return 0 on one pair array" in {
    val n = Solution2.solution(Array(1, 1), 1)
    n should equal(0)
  }

}
