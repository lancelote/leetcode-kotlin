package p80

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        var duplicate = false
        var writer = 1

        for (i in 1 until nums.size) {
            if (nums[i - 1] != nums[i] || !duplicate) {
                duplicate = nums[i - 1] == nums[i]
                nums[writer] = nums[i]
                writer++
            } else {
                duplicate = true
            }
        }

        return writer
    }
}
