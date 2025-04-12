package p345

import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.params.provider.Arguments
import java.util.stream.Stream

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun reverseVowels(s: String, expected: String) {
        assertEquals(expected, Solution().reverseVowels(s))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("IceCreAm", "AceCreIm"),
            Arguments.of("leetcode", "leotcede"),
        )
    }
}
