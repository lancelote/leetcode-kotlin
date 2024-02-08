package p2

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

fun linkedListToArray(linkedList: ListNode?): Array<Int> {
    val result = mutableListOf<Int>()
    var current = linkedList

    while (current != null) {
        result.add(current.`val`)
        current = current.next
    }

    return result.toTypedArray()
}

fun arrayToLinkedList(array: Array<Int>): ListNode? {
    val dummy = ListNode()
    var current: ListNode? = dummy

    for (num in array) {
        current?.next = ListNode(num)
        current = current?.next
    }
    return dummy.next
}

class SolutionTest {

    @Test
    fun addTwoNumbers1() {
        val l1 = arrayToLinkedList(arrayOf(2, 4, 3))
        val l2 = arrayToLinkedList(arrayOf(5, 6, 4))

        val result = Solution().addTwoNumbers(l1, l2)

        assertArrayEquals(linkedListToArray(result), arrayOf(7, 0, 8))
    }

    @Test
    fun addTwoNumbers2() {
        val l1 = arrayToLinkedList(arrayOf(0))
        val l2 = arrayToLinkedList(arrayOf(0))

        val result = Solution().addTwoNumbers(l1, l2)

        assertArrayEquals(linkedListToArray(result), arrayOf(0))
    }

    @Test
    fun addTwoNumbers3() {
        val l1 = arrayToLinkedList(arrayOf(9, 9, 9, 9, 9, 9, 9))
        val l2 = arrayToLinkedList(arrayOf(9, 9, 9, 9))

        val result = Solution().addTwoNumbers(l1, l2)

        assertArrayEquals(linkedListToArray(result), arrayOf(8, 9, 9, 9, 0, 0, 0, 1))
    }
}
