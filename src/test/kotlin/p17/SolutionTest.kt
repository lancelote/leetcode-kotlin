package p17

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun letterCombinations(digits: String, expected: List<String>) {
        assertEquals(expected, Solution().letterCombinations(digits))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of("23", listOf("ad","ae","af","bd","be","bf","cd","ce","cf")),
            Arguments.of("", listOf<String>()),
            Arguments.of("2", listOf("a","b","c")),
        )
    }
}
