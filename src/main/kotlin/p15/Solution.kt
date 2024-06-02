package p15

class Solution {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        val sortedNums = nums.sorted()

        for ((i, num1) in sortedNums.withIndex()) {
            if (i > 0 && num1 == sortedNums[i - 1]) continue

            var left = i + 1
            var right = sortedNums.lastIndex

            while (left < right) {
                val num2 = sortedNums[left]
                val num3 = sortedNums[right]

                if (num1 + num2 + num3 == 0) {
                    result.add(listOf(num1, num2, num3))

                    left++

                    while (left < right && sortedNums[left] == sortedNums[left - 1]) left++

                    right = sortedNums.lastIndex
                } else if (num1 + num2 + num3 < 0) {
                    left++
                } else {
                    right--
                }

            }
        }

        return result
    }
}
