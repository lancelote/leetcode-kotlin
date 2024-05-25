package p9

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun isPalindrome(x: Int, expected: Boolean) {
        assertEquals(expected, Solution().isPalindrome(x))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(121, true),
            Arguments.of(-121, false),
            Arguments.of(10, false),
        )
    }
}
