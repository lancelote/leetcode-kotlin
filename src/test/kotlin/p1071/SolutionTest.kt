package p1071

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun gcdOfStrings(str1: String, str2: String, expected: String) {
        assertEquals(expected, Solution().gcdOfStrings(str1, str2))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("ABCABC", "ABC", "ABC"),
            Arguments.of("ABABAB", "ABAB", "AB"),
            Arguments.of("LEET", "CODE", ""),
        )
    }
}
