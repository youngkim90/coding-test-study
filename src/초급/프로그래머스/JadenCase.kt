package 초급.프로그래머스

object JadenCase {
  fun solution(s: String): String {
    return s.split(" ").joinToString(" ") {
      it.lowercase().replaceFirstChar { chars -> chars.uppercase() }
    }
  }
}


fun main() {
  println(JadenCase.solution("3people unFollowed me")) // "3people Unfollowed Me"
  println(JadenCase.solution("for the last week")) // "For The Last Week"
}
