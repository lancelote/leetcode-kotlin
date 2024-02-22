package p4

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var i1 = 0
        var i2 = 0
        val n = nums1.size + nums2.size
        val middle = n / 2

        var prev = 0
        var curr = 0

        while (i1 < nums1.size && i2 < nums2.size && i1 + i2 <= middle) {
            prev = curr

            if (nums1[i1] < nums2[i2]) {
                curr = nums1[i1]
                i1++
            } else {
                curr = nums2[i2]
                i2++
            }
        }

        while (i1 < nums1.size && i1 + i2 <= middle) {
            prev = curr
            curr = nums1[i1]
            i1++
        }

        while (i2 < nums2.size && i1 + i2 <= middle) {
            prev = curr
            curr = nums2[i2]
            i2++
        }

        return if (n % 2 == 1) {
            curr.toDouble()
        } else {
            (prev + curr) / 2.0
        }
    }
}
