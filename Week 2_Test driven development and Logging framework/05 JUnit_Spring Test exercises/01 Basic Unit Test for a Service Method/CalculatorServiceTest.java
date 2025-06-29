package junit_maven;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorServiceTest {

    @Test
    void testAdd() {
        System.out.println("Testing add() method");
        CalculatorService service = new CalculatorService();
        assertEquals(7, service.add(3, 4));
    }
}
