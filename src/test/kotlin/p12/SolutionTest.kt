package p12

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun intToRoman(num: Int, expected: String) {
        assertEquals(expected, Solution().intToRoman(num))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(3749, "MMMDCCXLIX"),
            Arguments.of(58, "LVIII"),
            Arguments.of(1994, "MCMXCIV"),
        )
    }
}
