package p20

val CLOSE_TO_OPEN = mapOf(')' to '(', '}' to '{', ']' to '[')

class Solution {
    fun isValid(s: String): Boolean {
        val stack = ArrayDeque<Char>()

        for (x in s) {
            if (x in CLOSE_TO_OPEN.keys) {
                if (stack.removeLastOrNull() != CLOSE_TO_OPEN[x]) return false
            } else {
                stack.addLast(x)
            }
        }

        return stack.isEmpty()
    }
}
