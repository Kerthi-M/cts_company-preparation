package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testVoidMethodStub() {
        System.out.println("Stubbing sendData");
        ExternalApi mockApi = mock(ExternalApi.class);
        doNothing().when(mockApi).sendData("Hello");
        MyService service = new MyService(mockApi);
        service.sendMessage();
        verify(mockApi).sendData("Hello");
    }
}
