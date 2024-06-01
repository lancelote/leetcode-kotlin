package p10

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun isMatch(s: String, p: String, expected: Boolean) {
        assertEquals(expected, Solution().isMatch(s, p))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("aa", "a", false),
            Arguments.of("aa", "a*", true),
            Arguments.of("ab", ".*", true),
        )
    }
}
