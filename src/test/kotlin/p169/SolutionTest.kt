package p169

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun majorityElement(nums: IntArray, expected: Int) {
        assertEquals(expected, Solution().majorityElement(nums))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(3, 2, 3), 3),
            Arguments.of(intArrayOf(2, 2, 1, 1, 1, 2, 2), 2),
        )
    }
}
