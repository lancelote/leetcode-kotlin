package p80

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun removeDuplicates(nums: IntArray, expectedNums: IntArray, expectedNum: Int) {
        assertEquals(expectedNum, Solution().removeDuplicates(nums))
        assertArrayEquals(expectedNums, nums)
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 1, 1, 2, 2, 3), intArrayOf(1, 1, 2, 2, 3, 3), 5),
            Arguments.of(intArrayOf(0, 0, 1, 1, 1, 1, 2, 3, 3), intArrayOf(0, 0, 1, 1, 2, 3, 3, 3, 3), 7),
        )
    }
}
