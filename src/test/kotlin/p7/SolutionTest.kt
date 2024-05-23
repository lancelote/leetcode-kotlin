package p7

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun reverse(x: Int, expected: Int) {
        assertEquals(expected, Solution().reverse(x))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(123, 321),
                Arguments.of(-123, -321),
                Arguments.of(120, 21),
                Arguments.of(1534236469, 0),
            )
        }
    }
}
