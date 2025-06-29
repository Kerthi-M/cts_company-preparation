package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    void testVoidThrows() {
        System.out.println("Testing void method throwing exception");
        ExternalApi mockApi = mock(ExternalApi.class);
        doThrow(new RuntimeException("fail")).when(mockApi).sendData("error");
        MyService service = new MyService(mockApi);
        assertThrows(RuntimeException.class, service::riskySend);
    }
}
