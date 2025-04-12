package p345

val VOWELS = setOf('a', 'e', 'i', 'o', 'u')


class Solution {
    fun reverseVowels(s: String): String {
        val parts = mutableListOf<String>()
        val vowels = mutableListOf<Char>()

        val part = StringBuilder()

        for (x in s) {
            if (VOWELS.contains(x.lowercaseChar())) {
                parts.add(part.toString())
                part.clear()
                vowels.add(x)
            } else {
                part.append(x)
            }
        }

        parts.add(part.toString())

        val result = StringBuilder()

        for (i in 0 until vowels.size) {
            result.append(parts[i])
            result.append(vowels.removeLast())
        }

        result.append(parts.last())
        return result.toString()
    }
}
