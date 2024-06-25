package p27

class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var replaceIdx = 0

        for (num in nums) {
            if (num ==  `val`) continue
            nums[replaceIdx] = num
            replaceIdx++
        }

        return replaceIdx
    }
}
