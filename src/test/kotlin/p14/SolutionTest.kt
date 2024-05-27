package p14

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertEquals

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun longestCommonPrefix(strs: Array<String>, expected: String) {
        assertEquals(expected, Solution().longestCommonPrefix(strs))
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(arrayOf("flower","flow","flight"), "fl"),
            Arguments.of(arrayOf("dog","racecar","car"), ""),
        )
    }
}
