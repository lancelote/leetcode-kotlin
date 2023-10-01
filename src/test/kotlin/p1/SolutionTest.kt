package p1

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class SolutionTest {

    @Test
    fun twoSum1() {
        assertArrayEquals(Solution().twoSum(intArrayOf(2,7,11,15), 9), intArrayOf(0, 1))
    }

    @Test
    fun twoSum2() {
        assertArrayEquals(Solution().twoSum(intArrayOf(3, 2, 4), 6), intArrayOf(1, 2))
    }

    @Test
    fun twoSum3() {
        assertArrayEquals(Solution().twoSum(intArrayOf(3, 3), 6), intArrayOf(0, 1))
    }
}
