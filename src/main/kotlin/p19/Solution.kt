package p19

import utils.linkedList.ListNode

class Solution {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        val dummy: ListNode? = ListNode(0)
        dummy!!.next = head

        var slow = dummy
        var fast = dummy

        repeat(n) {
            fast = fast!!.next
        }

        while (fast!!.next != null) {
            slow = slow!!.next
            fast = fast!!.next
        }

        slow!!.next = slow.next!!.next
        return dummy.next
    }
}
