package p15

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun threeSum(nums: IntArray, expected: List<List<Int>>) {
        assertEquals(expected, Solution().threeSum(nums))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(-1, 0, 1, 2, -1, -4), listOf(listOf(-1, -1, 2), listOf(-1, 0, 1))),
            Arguments.of(intArrayOf(0, 1, 1), listOf<List<Int>>()),
            Arguments.of(intArrayOf(0, 0, 0), listOf(listOf(0, 0, 0))),
        )
    }
}
