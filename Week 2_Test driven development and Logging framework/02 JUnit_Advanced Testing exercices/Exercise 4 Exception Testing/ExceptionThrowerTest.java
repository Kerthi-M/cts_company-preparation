package ex_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExceptionThrowerTest {
    @Test
    void testThrow() {
        System.out.println("Testing exception");
        ExceptionThrower e = new ExceptionThrower();
        assertThrows(IllegalArgumentException.class, e::throwError);
    }
}
