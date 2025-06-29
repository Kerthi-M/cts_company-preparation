package ex_3;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import org.mockito.InOrder;

public class MyServiceTest {

    @Test
    void testInteractionOrder() {
        System.out.println("Verifying method call order");
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);
        service.process();
        InOrder order = inOrder(mockApi);
        order.verify(mockApi).getData();
        order.verify(mockApi).sendData("done");
    }
}
