package junit_maven;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.Assertions;
import org.mockito.InjectMocks;

@ExtendWith(MockitoExtension.class)
public class ParameterizedAdditionTest {

    @InjectMocks
    private CalculatorService calculatorService;

    @ParameterizedTest
    @CsvSource({
        "1, 2, 3",
        "5, 5, 10",
        "10, -5, 5"
    })
    public void testAdd(int a, int b, int expected) {
        int result = calculatorService.add(a, b);
        Assertions.assertEquals(expected, result);
    }
}
