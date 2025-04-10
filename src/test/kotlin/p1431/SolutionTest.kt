package p1431

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun kidsWithCandies(candies: IntArray, extraCandies: Int, expected: List<Boolean>) {
        assertEquals(expected, Solution().kidsWithCandies(candies, extraCandies))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(2, 3, 5, 1, 3), 3, listOf(true, true, true, false, true)),
            Arguments.of(intArrayOf(4, 2, 1, 1, 2), 1, listOf(true, false, false, false, false)),
            Arguments.of(intArrayOf(12, 1, 12), 10, listOf(true, false, true)),
        )
    }
}
