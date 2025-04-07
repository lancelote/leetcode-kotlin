package p1768

class Solution {
    fun mergeAlternately(word1: String, word2: String): String {
        var i1 = 0
        var i2 = 0

        val sb = StringBuilder()

        while (i1 < word1.length && i2 < word2.length) {
            sb.append(word1[i1])
            sb.append(word2[i2])

            i1++
            i2++
        }

        while (i1 < word1.length) {
            sb.append(word1[i1])
            i1++
        }

        while (i2 < word2.length) {
            sb.append(word2[i2])
            i2++
        }

        return sb.toString()
    }
}
