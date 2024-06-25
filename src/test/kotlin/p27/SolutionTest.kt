package p27

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertArrayEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun removeElement(nums: IntArray, `val`: Int, expNum: Int, expArray: IntArray) {
        assertEquals(expNum, Solution().removeElement(nums, `val`))
        assertArrayEquals(expArray, nums)
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(3, 2, 2, 3), 3, 2, intArrayOf(2, 2, 2, 3)),
            Arguments.of(intArrayOf(0, 1, 2, 2, 3, 0, 4, 2), 2, 5, intArrayOf(0, 1, 3, 0, 4, 0, 4, 2))
        )
    }
}
