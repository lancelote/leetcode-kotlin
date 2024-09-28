package p18

class Solution {
    fun fourSum(nums: IntArray, target: Int): List<List<Int>> {
        val sortedNums = nums.sorted()
        val result = mutableListOf<List<Int>>()

        for (i in 0 until sortedNums.size - 3) {
            if (i > 0 && sortedNums[i] == sortedNums[i - 1]) continue

            for (j in i + 1 until sortedNums.size - 2) {
                if (j > i + 1 && sortedNums[j] == sortedNums[j - 1]) continue

                val a = sortedNums[i]
                val b = sortedNums[j]

                var left = j + 1
                var right = sortedNums.lastIndex

                while (left < right) {
                    val c = sortedNums[left]
                    val d = sortedNums[right]

                    val fourSum = listOf(a, b, c, d).sumOf { it.toLong() }

                    if (fourSum == target.toLong()) {
                        result.add(listOf(a, b, c, d))

                        left++
                        while (left < right && sortedNums[left] == sortedNums[left - 1]) left++
                    } else if (fourSum < target) {
                        left++
                    } else {
                        right--
                    }
                }
            }
        }

        return result
    }
}
