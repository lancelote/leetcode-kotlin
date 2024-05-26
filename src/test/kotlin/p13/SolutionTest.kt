package p13

import java.util.stream.Stream
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun romanToInt(s: String, expected: Int) {
        assertEquals(expected, Solution().romanToInt(s))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("III", 3),
            Arguments.of("LVIII", 58),
            Arguments.of("MCMXCIV", 1994),
        )
    }
}
