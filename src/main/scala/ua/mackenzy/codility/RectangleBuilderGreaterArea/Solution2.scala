package ua.mackenzy.codility.RectangleBuilderGreaterArea

object Solution2 {

  //53 %
  def solution(a: Array[Int], x: Int): Int = {
    val m = a
      .groupBy(a => a).filter { case (_, v) => v.length / 2 > 0 }
      .values
      .flatMap(l => l.grouped(2).filter(b => b.length == 2).map(r => r.head))

    val mi = m.zipWithIndex
    val unsortedPairs = for {
      (vi, i) <- mi
      (vj, j) <- mi if i != j && vi.toLong * vj >= x
    } yield Seq(vi, vj)

    val pairs = unsortedPairs.map(l => l.sorted).toList.distinct

    if (pairs.size > 1000000000) -1
    else pairs.size
  }
}
