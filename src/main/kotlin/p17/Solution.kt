package p17

val DIGIT_TO_CHARS = mapOf(
    '2' to "abc",
    '3' to "def",
    '4' to "ghi",
    '5' to "jkl",
    '6' to "mno",
    '7' to "pqrs",
    '8' to "tuv",
    '9' to "wxyz",
)

class Solution {
    fun letterCombinations(digits: String): List<String> {
        val result = mutableListOf<String>()
        val soFar = mutableListOf<Char>()

        fun dfs(i: Int = 0) {
            if (i >= digits.length) {
                if (soFar.isNotEmpty()) result.add(soFar.joinToString(""))
                return
            }

            val chars = DIGIT_TO_CHARS[digits[i]]!!

            for (char in chars) {
                soFar.add(char)
                dfs(i + 1)
                soFar.removeLast()
            }
        }

        dfs()
        return result
    }
}
