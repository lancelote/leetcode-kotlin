package p10

class Solution {
    fun isMatch(s: String, p: String): Boolean {
        val cache: MutableMap<Pair<Int, Int>, Boolean> = mutableMapOf()

        fun dfs(i: Int, j: Int): Boolean {
            val result: Boolean
            if (cache.containsKey(Pair(i, j))) return cache[Pair(i, j)]!!

            if (i >= s.length && j >= p.length) {
                result = true
            } else if (i >= s.length && j < p.length - 1 && p[j + 1] == '*') {
                result = dfs(i, j + 2)
            } else if (i >= s.length || j >= p.length) {
                result = false
            } else if (j < p.length - 1 && p[j + 1] == '*') {
                result = if (s[i] == p[j] || p[j] == '.') {
                    dfs(i, j + 2) || dfs(i + 1, j)
                } else {
                    dfs(i, j + 2)
                }
            } else if (p[j] == '.') {
                result = dfs(i + 1, j + 1)
            } else if (s[i] != p[j]) {
                result = false
            } else {
                result = dfs(i + 1, j + 1)
            }

            cache[Pair(i, j)] = result
            return result
        }

        return dfs(0, 0)
    }
}
