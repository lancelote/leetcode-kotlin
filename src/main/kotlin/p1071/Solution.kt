package p1071

class Solution {
    fun getLongestPrefix(str1: String, str2: String) = str1
            .zip(str2)
            .takeWhile { it.first == it.second }
            .map { it.first }
            .joinToString("")

    fun splits(prefix: String, str: String): Boolean {
        if (str.length % prefix.length != 0) return false

        val count = str.length / prefix.length

        for (i in 0 until count) {
            for (j in 0 until prefix.length) {
                if (str[i * prefix.length + j] != prefix[j]) return false
            }
        }

        return true
    }

    fun gcdOfStrings(str1: String, str2: String): String {
        val longestPrefix = getLongestPrefix(str1, str2)

        for (i in longestPrefix.length downTo 1) {
            val prefix = str1.substring(0, i)
            if (splits(prefix, str1) && splits(prefix, str2)) return prefix
        }

        return ""
    }
}
