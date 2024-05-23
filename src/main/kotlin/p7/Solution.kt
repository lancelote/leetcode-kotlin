package p7

class Solution {
    fun reverse(x: Int): Int {
        var result = 0L
        var num = x

        while (num != 0) {
            val digit = num % 10
            num /= 10

            result = result * 10 + digit

            if (result > Int.MAX_VALUE || result < Int.MIN_VALUE) {
                return 0
            }
        }

        return result.toInt()
    }
}
