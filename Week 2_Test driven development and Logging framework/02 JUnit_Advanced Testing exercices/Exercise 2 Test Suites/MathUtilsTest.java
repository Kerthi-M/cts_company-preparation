package ex_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void testMultiply() {
        System.out.println("MathUtilsTest: multiply");
        assertEquals(20, 4 * 5);
    }
}
