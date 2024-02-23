package p5

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun longestPalindrome(s: String, expectedPalindrome: String) {
        assertEquals(expectedPalindrome, Solution().longestPalindrome(s))
    }

    companion object {
        @JvmStatic
        fun getTestData() : Stream<Arguments> {
            return Stream.of(
                Arguments.of("babad", "bab"),
                Arguments.of("cbbd", "bb"),
            )
        }
    }
}
