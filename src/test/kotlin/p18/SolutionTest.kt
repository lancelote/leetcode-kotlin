package p18

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun fourSum(nums: IntArray, target: Int, expected: List<List<Int>>) {
        assertEquals(expected, Solution().fourSum(nums, target))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(
                intArrayOf(1, 0, -1, 0, -2, 2),
                0,
                listOf(listOf(-2, -1, 1, 2), listOf(-2, 0, 0, 2), listOf(-1, 0, 0, 1))
            ),
            Arguments.of(intArrayOf(2, 2, 2, 2, 2), 8, listOf(listOf(2, 2, 2, 2))),
            Arguments.of(intArrayOf(1000000000,1000000000,1000000000,1000000000), -294967296, emptyList<List<Int>>()),
        )
    }
}
