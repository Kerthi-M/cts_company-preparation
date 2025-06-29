package ex_1;

import static org.junit.Assert.*;
import org.junit.*;

public class AAA {
    private Calculator calc;

    @Before
    public void setUp() {
        calc = new Calculator();
        System.out.println("Before each test");
    }

    @After
    public void tearDown() {
        System.out.println("After each test");
    }

    @Test
    public void testAdd() {
        int result = calc.add(10, 5);
        assertEquals(15, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(9, 4);
        assertEquals(5, result);
    }
}
