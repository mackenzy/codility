package ua.mackenzy.codility.MinAbsSumOfTwo

object Solution {
  def solution(a: Array[Int]): Int = {
    val s = a.sorted

    var m = 0
    while (m < s.length && s(m) < 0)
      m += 1

    var l = if (m > 0) m - 1 else m
    var r = if (m < s.length) m else m - 1

    var min = math.min((s(l) * 2).abs, (s(r) * 2).abs)

    while (l > -1 && r < s.length) {
      min = math.min(min, (s(r) + s(l)).abs)
      if (s(r) < -s(l))
        r += 1
      else
        l -= 1
    }
    min
  }
}