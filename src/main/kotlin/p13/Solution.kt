package p13

class Solution {
    fun romanToInt(s: String): Int {
        var num = 0
        val values = mapOf('I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000)

        for ((i, char) in s.withIndex()) {
            num += values[char]!!

            if (i > 0 && values[s[i - 1]]!! < values[char]!!) {
                num -= values[s[i - 1]]!! * 2
            }
        }

        return num
    }
}
