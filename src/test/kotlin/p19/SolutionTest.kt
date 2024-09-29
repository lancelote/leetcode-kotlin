package p19

import java.util.stream.Stream
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.MethodSource
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.api.Assertions.assertArrayEquals

import utils.linkedList.arrayToLinkedList
import utils.linkedList.linkedListToArray

class SolutionTest {
    @ParameterizedTest
    @MethodSource("getTestData")
    fun removeNthFromEnd(inList: Array<Int>, n: Int, expectedArray: Array<Int>) {
        val linkedList = arrayToLinkedList(inList)
        val actualLinkedList = Solution().removeNthFromEnd(linkedList, n)
        val actualArray = linkedListToArray(actualLinkedList)
        assertArrayEquals(expectedArray, actualArray)
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(arrayOf(1, 2, 3, 4, 5), 2, arrayOf(1, 2, 3, 5)),
            Arguments.of(arrayOf(1), 1, arrayOf<Int>()),
            Arguments.of(arrayOf(1, 2), 1, arrayOf(1)),
        )
    }
}
