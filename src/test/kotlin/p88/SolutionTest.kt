package p88

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int, expected: IntArray) {
        Solution().merge(nums1, m, nums2, n)
        assertArrayEquals(expected, nums1)
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 2, 3, 0, 0, 0), 3, intArrayOf(2, 5, 6), 3, intArrayOf(1, 2, 2, 3, 5, 6)),
            Arguments.of(intArrayOf(1), 1, intArrayOf(), 0, intArrayOf(1)),
            Arguments.of(intArrayOf(0), 0, intArrayOf(1), 1, intArrayOf(1))
        )
    }
}
