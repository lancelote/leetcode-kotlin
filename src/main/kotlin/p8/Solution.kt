package p8

class Solution {
    fun myAtoi(s: String): Int {
        var num = 0
        var sign = 1

        var data = s.trimStart()

        if (data.startsWith("-")) sign = -1
        if (data.startsWith("+") || data.startsWith("-")) data = data.substring(1)

        for (c in data) {
            if (!c.isDigit()) break

            val digit = c.digitToInt()
            if (num > Int.MAX_VALUE / 10 || num == Int.MAX_VALUE / 10 && digit > 7) {
                return if (sign == 1) Int.MAX_VALUE else Int.MIN_VALUE
            }

            num = num * 10 + digit
        }

        return sign * num
    }
}
