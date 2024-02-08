package p2

class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode()

        var current = dummy
        var left = l1
        var right = l2

        var carry = 0

        while (left != null || right != null || carry != 0) {
            val leftVal = left?.`val` ?: 0
            val rightVal = right?.`val` ?: 0
            val newVal = (leftVal + rightVal + carry) % 10
            carry = (leftVal + rightVal + carry) / 10

            val newNode = ListNode(newVal)
            current.next = newNode
            current = newNode

            left = left?.next
            right = right?.next
        }

        return dummy.next
    }
}
