package p5

class Solution {
    fun longestPalindrome(s: String): String {
        val n = s.length

        var longestLen = 0
        var longestWord = ""

        fun longestPalindrome(startLeft: Int, startRight: Int) {
            var left = startLeft
            var right = startRight

            while (left >= 0 && right < n) {
                if (s[left] != s[right]) {
                    break
                }

                val len = 1 + right - left

                if (len > longestLen) {
                    longestLen = len
                    longestWord = s.substring(left, right + 1)
                }

                left--
                right++
            }
        }

        for (i in 0 until n) {
            longestPalindrome(i, i)
            longestPalindrome(i, i + 1)
        }

        return longestWord
    }
}
