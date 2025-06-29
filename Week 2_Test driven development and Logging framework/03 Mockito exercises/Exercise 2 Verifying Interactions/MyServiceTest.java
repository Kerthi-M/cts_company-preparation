package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;


public class MyServiceTest {

    @Test
    void testVerifyInteraction() {
        System.out.println("Verifying getData call");
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.fetchData();
        verify(mockApi).getData();
    }
}
