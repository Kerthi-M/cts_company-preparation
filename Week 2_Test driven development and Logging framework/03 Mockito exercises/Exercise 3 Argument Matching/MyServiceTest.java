package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testArgumentMatching() {
        System.out.println("Checking sendData called with any string");
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.sendMessage();
        verify(mockApi).sendData(anyString());
    }
}
