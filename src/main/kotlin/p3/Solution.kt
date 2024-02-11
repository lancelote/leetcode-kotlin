package p3

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val n = s.length
        val seen: MutableSet<Char> = mutableSetOf()
        var maxLen = 0

        var left = 0
        var right = 0

        while (right < n) {
            val char = s[right]

            while (seen.contains(char)) {
                seen.remove(s[left])
                left++
            }

            seen.add(char)
            right++
            maxLen = max(maxLen, right - left)
        }

        return maxLen
    }
}
