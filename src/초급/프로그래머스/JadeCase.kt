package 초급.프로그래머스

fun solution(s: String): String {
  return s.split(" ").joinToString(" ") {
    it.lowercase().replaceFirstChar { chars -> chars.uppercase() }
  }
}

fun main() {
  println(solution("3people unFollowed me")) // "3people Unfollowed Me"
  println(solution("for the last week")) // "For The Last Week"
}