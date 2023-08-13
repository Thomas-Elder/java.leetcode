package SolutionsTests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

import Utility.ListNode;
import Solutions.LinkedListCycle;
import org.junit.jupiter.api.BeforeEach;

public class LinkedListCycleTests {

    private LinkedListCycle _linkedListCycle;

    @BeforeEach
    void setUp(){
        _linkedListCycle = new LinkedListCycle();
    }

    // Helper method to create a linked list node
    private ListNode createNode(int val) {
        return new ListNode(val);
    }

    @Test
    public void testNoCycle() {
        // Create a linked list with no cycle
        ListNode node1 = createNode(1);
        ListNode node2 = createNode(2);
        ListNode node3 = createNode(3);
        ListNode node4 = createNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        assertFalse(_linkedListCycle.hasCycle(node1));
    }

    @Test
    public void testCycleAtBeginning() {
        // Create a linked list with a cycle at the beginning
        ListNode node1 = createNode(1);
        ListNode node2 = createNode(2);
        ListNode node3 = createNode(3);
        ListNode node4 = createNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node1;  // Cycle back to the beginning

        assertTrue(_linkedListCycle.hasCycle(node1));
    }

    @Test
    public void testCycleInMiddle() {
        // Create a linked list with a cycle in the middle
        ListNode node1 = createNode(1);
        ListNode node2 = createNode(2);
        ListNode node3 = createNode(3);
        ListNode node4 = createNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;  // Cycle in the middle

        assertTrue(_linkedListCycle.hasCycle(node1));
    }

    @Test
    public void testCycleAtEnd() {
        // Create a linked list with a cycle at the end
        ListNode node1 = createNode(1);
        ListNode node2 = createNode(2);
        ListNode node3 = createNode(3);
        ListNode node4 = createNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node4;  // Cycle at the end

        assertTrue(_linkedListCycle.hasCycle(node1));
    }
}
