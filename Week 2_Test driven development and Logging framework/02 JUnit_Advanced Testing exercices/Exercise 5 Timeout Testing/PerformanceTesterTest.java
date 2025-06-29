package ex_2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.Duration;

public class PerformanceTesterTest {

    @Test
    void testPerformance() {
        System.out.println("Checking performTask within 1 second");
        PerformanceTester p = new PerformanceTester();
        assertTimeout(Duration.ofSeconds(1), p::performTask);
    }
}
