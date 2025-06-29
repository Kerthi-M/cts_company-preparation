package ex_1;
import static org.junit.Assert.*;
import org.junit.Test;

public class AssertTest {
    @Test
    public void testAssertions() {
        assertEquals(5, 2 + 3);         
        assertTrue(5 > 3);              
        assertFalse(5 < 3);             
        assertNull(null);              
        assertNotNull(new Object());   
    }
}
