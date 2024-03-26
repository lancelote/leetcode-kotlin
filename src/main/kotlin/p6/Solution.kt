package p6

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows <= 1) return s
        val result = mutableListOf<Char>()

        var start = 0
        var first = numRows * 2 - 2
        var second = 0

        while (start < numRows && start < s.length) {
            var i = start
            result.add(s[i])

            while (true) {
                i += first
                if (first != 0 && i < s.length) result.add(s[i])

                i += second
                if (second != 0 && i < s.length) result.add(s[i])

                if (i >= s.length) break
            }

            start += 1
            first -= 2
            second += 2
        }

        return result.joinToString(separator = "")
    }
}
