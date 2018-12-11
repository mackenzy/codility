package ua.mackenzy.codility.MinAbsSumOfTwo

import org.scalatest.{FlatSpec, Matchers}

class SolutionSpec extends FlatSpec with Matchers{

  "Solution" should "return 1" in {
    val n = Solution.solution(Array(1, 4, -3))
    n should equal(1)
  }

  it should "return 3" in {
    val n = Solution.solution(Array(-8, 4, 5, -10, 3))
    n should equal(3)
  }

  it should "return 2" in {
    val n = Solution.solution(Array(1))
    n should equal(2)
  }

  it should "return 2 on -1" in {
    val n = Solution.solution(Array(-1))
    n should equal(2)
  }

  it should "return 0" in {
    val n = Solution.solution(Array(1, 3, 2, -2, 4, 5, 6))
    n should equal(0)
  }

  it should "return 6" in {
    val n = Solution.solution(Array(3, 6, 10, 15))
    n should equal(6)
  }

  it should "return 6 on -" in {
    val n = Solution.solution(Array(-3, -7, -10, -15))
    n should equal(6)
  }
}
