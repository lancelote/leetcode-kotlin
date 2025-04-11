package p605

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun canPlaceFlowers(flowerbed: IntArray, n: Int, expected: Boolean) {
        assertEquals(expected, Solution().canPlaceFlowers(flowerbed, n))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(intArrayOf(1, 0, 0, 0, 1), 1, true),
            Arguments.of(intArrayOf(1, 0, 0, 0, 1), 2, false),
        )
    }
}
