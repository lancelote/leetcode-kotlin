package p11

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun maxArea(height: IntArray, expected: Int) {
        assertEquals(expected, Solution().maxArea(height))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1,8,6,2,5,4,8,3,7), 49),
            Arguments.of(intArrayOf(1, 1), 1),
        )
    }
}
