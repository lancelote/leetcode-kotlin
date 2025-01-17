package p21

import utils.linkedList.ListNode

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
        val dummy = ListNode()
        var tail = dummy
        var head1 = list1
        var head2 = list2

        while (head1 != null && head2 != null) {
            val newNode: ListNode?

            if (head1.`val` > head2.`val`) {
                newNode = ListNode(head2.`val`)
                head2 = head2.next
            } else {
                newNode = ListNode(head1.`val`)
                head1 = head1.next
            }

            tail.next = newNode
            tail = newNode
        }

        while (head1 != null) {
            val newNode = ListNode(head1.`val`)
            head1 = head1.next
            tail.next = newNode
            tail = newNode
        }

        while (head2 != null) {
            val newNode = ListNode(head2.`val`)
            head2 = head2.next
            tail.next = newNode
            tail = newNode
        }

        return dummy.next
    }
}
