package p8

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun myAtoi(s: String, expected: Int) {
        assertEquals(expected, Solution().myAtoi(s))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("42", 42),
            Arguments.of(" -042", -42),
            Arguments.of("1337c0d3", 1337),
            Arguments.of("0-1", 0),
            Arguments.of("words and 987", 0),
            Arguments.of("-91283472332", -2147483648),
            Arguments.of("-2147483649", -2147483648),
            Arguments.of("-2147483647", -2147483647)
        )
    }
}
