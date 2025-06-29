package ex_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class MutliReturnServiceTest {

    @Test
    void testServiceWithMultipleReturnValues() {
        System.out.println("Testing multiple return values from mock");
        Repository mockRepo = mock(Repository.class);
        when(mockRepo.getData())
                .thenReturn("First Mock Data")
                .thenReturn("Second Mock Data");
        Service service = new Service(mockRepo);
        String first = service.processData();
        String second = service.processData();
        assertEquals("Processed First Mock Data", first);
        assertEquals("Processed Second Mock Data", second);
    }
}
