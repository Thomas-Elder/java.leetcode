package Solutions;
import Utility.ListNode;

public class LinkedListCycle {

    // There is a cycle in a linked list if there is some node in the list that can be reached again by
    // continuously following the next pointer. Internally, pos is used to denote the index of the node
    // that tail's next pointer is connected to.
    //
    // This function returns true if there is a cycle, and false otherwise.
    public boolean hasCycle(ListNode head) {

        // Trivial cases first, if there's only zero or one node, there cannot be a cycle.
        if (head == null || head.next == null) { return false; }

        ListNode a = head;
        ListNode b = head.next;

        while (a != b) {

            // If a cycle exists, we'll never reach the end of the list, so if either node is null
            // we know there is no cycle.
            if (b == null || b.next == null) { return false; }

            // Now we advance the nodes, a once, b twice. This ensures they'll meet up at some point,
            // even if we loop through the cycle several times, they're out of sync, so they'll eventually
            // meet.
            a = a.next;
            b = b.next.next;
        }

        return true;
    }
}
