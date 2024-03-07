package 초급.프로그래머스

object 이진변환반복 {
  fun solution(s: String): IntArray {
    val answer: IntArray
    var count = 0
    var zeroCount = 0
    var str = s

    while (str != "1") {
      if (str.contains("0")) {
        zeroCount += str.count { it == '0' }
        str = str.replace("0", "")
      }
      str = Integer.toBinaryString(str.length)
      count++
    }
    answer = intArrayOf(count, zeroCount)
    return answer
  }
}

fun main() {
  println(이진변환반복.solution("110010101001").contentToString())
  println(이진변환반복.solution("01110").contentToString())
  println(이진변환반복.solution("1111111").contentToString())
}
