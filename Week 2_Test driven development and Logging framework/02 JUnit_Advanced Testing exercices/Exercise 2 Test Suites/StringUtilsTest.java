package ex_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
    @Test
    void testUpper() {
        System.out.println("StringUtilsTest: toUpperCase");
        assertEquals("JAVA", "java".toUpperCase());
    }
}
