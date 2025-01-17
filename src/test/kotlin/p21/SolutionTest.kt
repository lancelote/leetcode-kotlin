package p21

import org.junit.jupiter.api.Assertions.assertArrayEquals
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import utils.linkedList.arrayToLinkedList
import utils.linkedList.linkedListToArray
import java.util.stream.Stream

class SolutionTest {

    @ParameterizedTest
    @MethodSource("getTestData")
    fun mergeTwoLists(array1: Array<Int>, array2: Array<Int>, expectedArray: Array<Int>) {
        val l1 = arrayToLinkedList(array1)
        val l2 = arrayToLinkedList(array2)

        val result = Solution().mergeTwoLists(l1, l2)

        assertArrayEquals(linkedListToArray(result), expectedArray)
    }

    companion object {
        @JvmStatic
        fun getTestData(): Stream<Arguments> = Stream.of(
            Arguments.of(arrayOf(1, 2, 4), arrayOf(1, 3, 4), arrayOf(1, 1, 2, 3, 4, 4)),
            Arguments.of(emptyArray<Int>(), emptyArray<Int>(), emptyArray<Int>()),
            Arguments.of(emptyArray<Int>(), arrayOf(0), arrayOf(0)),
        )
    }
}
