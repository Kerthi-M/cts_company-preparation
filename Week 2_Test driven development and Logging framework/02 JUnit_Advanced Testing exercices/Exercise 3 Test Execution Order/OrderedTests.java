package ex_2;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class OrderedTests {

    @Test
    @Order(1)
    void testA() {
        System.out.println("Executing testA");
        assertEquals(2, 1 + 1);
    }

    @Test
    @Order(2)
    void testB() {
        System.out.println("Executing testB");
        assertTrue(5 > 3);
    }
}
