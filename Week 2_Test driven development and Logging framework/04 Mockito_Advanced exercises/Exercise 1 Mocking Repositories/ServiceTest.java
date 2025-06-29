package ex_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ServiceTest {

    @Test
    void testServiceWithMockRepository() {
        System.out.println("Testing Service with mock Repository");
        Repository mockRepo = mock(Repository.class);
        when(mockRepo.getData()).thenReturn("Mock Data");
        Service service = new Service(mockRepo);
        String result = service.processData();
        assertEquals("Processed Mock Data", result);
    }
}
