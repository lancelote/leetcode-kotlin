package p9

class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) return false
        if (x % 10 == 0 && x != 0) return false

        var left = x
        var right = 0

        while (left > right) {
            val digit = left % 10
            left /= 10
            right = right * 10 + digit
        }

        return left == right || left == right / 10
    }
}
