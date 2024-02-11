package utils.linkedList

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
