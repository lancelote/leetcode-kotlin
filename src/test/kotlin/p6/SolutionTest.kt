package p6

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun convert(s: String, numRows: Int, expected: String) {
        assertEquals(expected, Solution().convert(s, numRows))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> {
            return Stream.of(
                Arguments.of("PAYPALISHIRING", 3, "PAHNAPLSIIGYIR"),
                Arguments.of("PAYPALISHIRING", 4, "PINALSIGYAHRPI"),
                Arguments.of("A", 1, "A"),
                Arguments.of("A", 2, "A"),
            )
        }
    }
}
