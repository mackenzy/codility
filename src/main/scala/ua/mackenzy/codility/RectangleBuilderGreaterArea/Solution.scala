package ua.mackenzy.codility.RectangleBuilderGreaterArea

object Solution {

  //100%
  //https://app.codility.com/demo/results/trainingDN4N42-5VA/
  def solution(a: Array[Int], x: Int): Int = {

    val m = a.groupBy(a => a).filter { case (_, v) => v.length / 2 > 0 }
    val keys = m.keys.toArray.sorted
    val l = keys.length

    var i = l - 1
    while (i > 0 && keys(i).toLong * keys(i - 1) >= x) i -= 1

    val r = l - i - 1
    val right = r.toLong * (r + 1) / 2

    var left = 0
    var j = i + 1
    while (i > 0) {
      i -= 1
      while (j < l && keys(i).toLong * keys(j) < x) j += 1
      left += l - j
    }

    val rectangles = left + right

    val squares = m.filter { case (k, v) => v.length >= 4 && k.toLong * k >= x }.keys.size

    val total = rectangles + squares
    if (total > 1000000000) -1
    else total.toInt
  }
}