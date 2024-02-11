package p3

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getTestData")
    fun addTwoNumbers(s: String, expectedLen: Int) {
        assertEquals(expectedLen, Solution().lengthOfLongestSubstring(s))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("abcabcbb", 3),
                Arguments.of("bbbbb", 1),
                Arguments.of("pwwkew", 3),
            )
        }
    }
}
