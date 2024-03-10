package 입문.프로그래머스

object 직사각형좌표 {
  // 직사각형을 만드는 데 필요한 4개의 점 중 3개의 좌표가 주어질 때 나머지 한 점의 좌표를 구하시오.
  fun solution(v: Array<IntArray>): IntArray {
    val x = mutableListOf<Int>()
    val y = mutableListOf<Int>()
    for (i in v) {
      if (x.contains(i[0])) {
        x.remove(i[0])
      } else {
        x.add(i[0])
      }
      if (y.contains(i[1])) {
        y.remove(i[1])
      } else {
        y.add(i[1])
      }
    }
    return intArrayOf(x[0], y[0])
  }
}


fun main() {
  println(직사각형좌표.solution(arrayOf(intArrayOf(1, 4), intArrayOf(3, 4), intArrayOf(3, 10))).contentToString()) // [1, 10]
  println(직사각형좌표.solution(arrayOf(intArrayOf(1, 1), intArrayOf(2, 2), intArrayOf(1, 2))).contentToString()) // [2, 1]
}