package p14

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var common = 0

        for ((i, char) in strs[0].withIndex()) {
            for (s in strs) {
                if (i >= s.length || char != s[i]) {
                    return strs[0].substring(0, common)
                }
            }
            common += 1
        }

        return strs[0]
    }
}
