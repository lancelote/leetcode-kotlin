package p26

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var reader = 0
        var writer = 1

        for (num in nums) {
            if (nums[reader] != num) {
                nums[writer] = num
                reader = writer
                writer++
            }
        }

        return writer
    }
}
