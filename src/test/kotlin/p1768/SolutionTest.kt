package p1768

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun mergeAlternately(word1: String, word2: String, expected: String) {
        assertEquals(expected, Solution().mergeAlternately(word1, word2))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("abc", "pqr", "apbqcr"),
            Arguments.of("ab", "pqrs", "apbqrs"),
            Arguments.of("abcd", "pq", "apbqcd"),
        )
    }
}
