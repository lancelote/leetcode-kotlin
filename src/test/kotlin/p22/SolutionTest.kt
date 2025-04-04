package p22

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun generateParenthesis(n: Int, expected: List<String>) {
        assertEquals(expected, Solution().generateParenthesis(n))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(3, listOf("()()()", "()(())", "(())()", "(()())", "((()))")),
            Arguments.of(1, listOf("()")),
        )
    }
}
