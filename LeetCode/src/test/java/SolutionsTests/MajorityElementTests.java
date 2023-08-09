package SolutionsTests;

import Solutions.MajorityElement;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class MajorityElementTests {

    private MajorityElement _majorityElement;

    @BeforeEach
    void setUp() {
        _majorityElement = new MajorityElement();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void majority_WhenPassedExampleOne_ReturnsExpectedResult(){
        // Arrange
        int [] input = new int[]{3, 3, 4, 2, 4, 4, 4};
        int expected = 4;

        // Act
        int actual = _majorityElement.majority(input);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void majority_WhenPassedExampleTwo_ReturnsExpectedResult(){
        // Arrange
        int [] input = new int[]{1, 2, 2, 2, 3, 2, 2};
        int expected = 2;

        // Act
        int actual = _majorityElement.majority(input);

        // Assert
        assertEquals(expected, actual);
    }

    @Test
    void majority_WhenPassedExampleThree_ReturnsExpectedResult(){
        // Arrange
        int [] input = new int[]{5, 5, 5, 2, 2, 5, 5};
        int expected = 5;

        // Act
        int actual = _majorityElement.majority(input);

        // Assert
        assertEquals(expected, actual);
    }
}