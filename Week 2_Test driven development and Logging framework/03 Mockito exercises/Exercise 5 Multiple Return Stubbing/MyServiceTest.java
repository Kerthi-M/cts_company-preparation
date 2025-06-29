package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testMultipleReturns() {
        System.out.println("Stubbing multiple return values");
        ExternalApi mockApi = mock(ExternalApi.class);
        when(mockApi.getNextId()).thenReturn(1, 2);
        MyService service = new MyService(mockApi);
        assertEquals(1, service.getId());
        assertEquals(2, service.getId());
    }
}
