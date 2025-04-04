package p22

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val result = mutableListOf<String>()

        var pairsLeft = n
        var openCount = 0
        val currentPath = ArrayDeque<Char>()

        fun dfs() {
            if (pairsLeft == 0 && openCount == 0) {
                result.add(currentPath.joinToString(""))
            } else if (openCount == 0) {
                // open
                openCount += 1
                pairsLeft -= 1
                currentPath.add('(')
                dfs()
                currentPath.removeLast()
                pairsLeft += 1
                openCount -= 1
            } else {
                // either close
                openCount -= 1
                currentPath.add(')')
                dfs()
                currentPath.removeLast()
                openCount += 1

                // or open
                if (pairsLeft != 0) {
                    openCount += 1
                    pairsLeft -= 1
                    currentPath.add('(')
                    dfs()
                    currentPath.removeLast()
                    pairsLeft += 1
                    openCount -= 1
                }
            }
        }

        dfs()

        return result
    }
}
