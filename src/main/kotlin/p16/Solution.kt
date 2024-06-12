package p16

import kotlin.math.abs

class Solution {
    fun threeSumClosest(nums: IntArray, target: Int): Int {
        val sortedNums = nums.sorted()
        var smallestDiff = Int.MAX_VALUE

        for (i in 0 until sortedNums.size - 2) {
            val a = sortedNums[i]

            var left = i + 1
            var right = sortedNums.lastIndex

            while (left < right) {
                val b = sortedNums[left]
                val c = sortedNums[right]

                val currentSum = a + b + c
                val diff = target - currentSum

                if (abs(diff) <= abs(smallestDiff)) {
                    smallestDiff = diff
                }

                if (currentSum < target) left++
                else if (currentSum > target) right--
                else return currentSum
            }
        }

        return target - smallestDiff
    }
}
