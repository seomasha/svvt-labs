package org.example.week1;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calculator;
    private final static int[] unsortedArray = {5, 2, 4, 1, 3};
    private final static int[] expectedSortedArray = {1, 2, 3, 4, 5};
    private final static int[] emptyArray = {};

    @BeforeAll
    public static void setUpBeforeClass() {
        System.out.println("Before all tests");
        calculator = new Calculator();
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Before each test");
    }

    @Test
    public void testAddition() {
        int result = calculator.subtract(10, 5);
        assertEquals(5, result, "10 - 5 should equal 5");
    }

    @Test
    public void testAdditionNegative() {
        assertNotEquals(6, calculator.add(2, 3), "2 + 3 should not equal 6");
    }

    @Test
    public void testFactorial() {
        assertEquals(120, calculator.factorial(5), "The factorial of 5 is 120.");
    }

    @Test
    public void testFactorialNegative() {
        assertNotEquals(125, calculator.factorial(5), "The factorial of 5 is 120.");
    }

    @Test
    public void assertNullIfSentenceIsNull() {
        assertNull(calculator.returnWordsFromSentence(null));
    }

    @Test
    public void assertNotNullIfSentenceIsNotNull() {
        assertNotNull(calculator.returnWordsFromSentence("Test for this case."));
    }

    @Test
    public void assertArrayIsSorted() {
        int[] resultArray = calculator.sort(unsortedArray);
        assertArrayEquals(expectedSortedArray, resultArray, "The array should be sorted in ascending order.");
    }

    @Test
    public void assertArrayIsEmpty() {
        int[] resultArray = calculator.sort(emptyArray);
        assertArrayEquals(emptyArray, resultArray, "An empty array should be returned for empty input.");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("After each test");
    }

    @AfterAll
    public static void tearDownAfterClass() {
        System.out.println("After all tests");
    }

}