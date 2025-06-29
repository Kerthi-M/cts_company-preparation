package ex_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class ApiServiceTest {

    @Test
    void testServiceWithMockRestClient() {
        System.out.println("Testing ApiService with mock RestClient");
        RestClient mockClient = mock(RestClient.class);
        when(mockClient.getResponse()).thenReturn("Mock Response");
        ApiService service = new ApiService(mockClient);
        String result = service.fetchData();
        assertEquals("Fetched Mock Response", result);
    }
}
