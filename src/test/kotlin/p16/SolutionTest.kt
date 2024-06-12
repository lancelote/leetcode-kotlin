package p16

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun threeSumClosest(nums: IntArray, target: Int, expected: Int) {
        assertEquals(expected, Solution().threeSumClosest(nums, target))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(-1, 2, 1, -4), 1, 2),
            Arguments.of(intArrayOf(0, 0, 0), 1, 0),
            Arguments.of(intArrayOf(0, 1, 2), 3, 3),
            Arguments.of(intArrayOf(1, 1, 1, 0), -100, 2),
        )
    }
}
