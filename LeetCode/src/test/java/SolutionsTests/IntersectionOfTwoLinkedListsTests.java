package SolutionsTests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import Solutions.IntersectionOfTwoLinkedLists;
import Utility.ListNode;

public class IntersectionOfTwoLinkedListsTests {

    private IntersectionOfTwoLinkedLists _intersectionOfTwoLinkedLists;

    @BeforeEach
    void setUp(){
        _intersectionOfTwoLinkedLists = new IntersectionOfTwoLinkedLists();
    }

    @Test
    public void testIntersectionNode() {
        // Create nodes
        ListNode commonNode = new ListNode(8);
        commonNode.next = new ListNode(4);
        commonNode.next.next = new ListNode(5);

        ListNode listA = new ListNode(4);
        listA.next = new ListNode(1);
        listA.next.next = commonNode;

        ListNode listB = new ListNode(5);
        listB.next = new ListNode(0);
        listB.next.next = new ListNode(1);
        listB.next.next.next = commonNode;

        // Call the function that finds the intersection point
        ListNode result = _intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB);

        // Assert the result
        assertEquals(commonNode, result);
    }

    @Test
    public void testNoIntersection() {
        // Create nodes
        ListNode listA = new ListNode(2);
        listA.next = new ListNode(6);
        listA.next.next = new ListNode(4);

        ListNode listB = new ListNode(1);
        listB.next = new ListNode(5);

        // Call the function that finds the intersection point
        ListNode result = _intersectionOfTwoLinkedLists.getIntersectionNode(listA, listB);

        // Assert the result
        assertNull(result); // There should be no intersection
    }
}
