package Solutions;

import Utility.ListNode;

public class IntersectionOfTwoLinkedLists {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        // Trivial case first, there can be not intersection if either list is null
        if (headA == null || headB == null){
            return null;
        }

        ListNode pointerA = headA;
        ListNode pointerB = headB;

        while (pointerA != pointerB) {
            // Move both pointers forward
            // If either pointer reaches the end of the list (== null), it is sent back to
            // the start of the other list. Given the total number of nodes when adding the two lists
            // will be the same no matter which list they start in, they'll both reach the intersection
            // at the same time even if the lists are of different lengths.
            // If they both end up null at the same time, it means the lists have no common node.
            pointerA = (pointerA == null) ? headB : pointerA.next;
            pointerB = (pointerB == null) ? headA : pointerB.next;
        }

        // Return the intersection point or null if no intersection
        return pointerA;
    }
}
