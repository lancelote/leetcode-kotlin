package p4

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getTestData")
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray, expectedMedian: Double) {
        assertEquals(expectedMedian, Solution().findMedianSortedArrays(nums1, nums2))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(intArrayOf(1, 3), intArrayOf(2), 2.0),
                Arguments.of(intArrayOf(1, 2), intArrayOf(3, 4), 2.5),
            )
        }
    }
}
