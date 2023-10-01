package p1

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complimentsMap: MutableMap<Int, Int> = mutableMapOf();

        for ((i, x) in nums.withIndex()) {
            val compliment = target - x
            complimentsMap[compliment]?.let { return intArrayOf(it, i) }
            complimentsMap[x] = i
        }

        throw IllegalArgumentException()
    }
}
