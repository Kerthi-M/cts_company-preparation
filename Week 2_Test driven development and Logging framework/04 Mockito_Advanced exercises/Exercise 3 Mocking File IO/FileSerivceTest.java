package ex_3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FileSerivceTest {

    @Test
    void testServiceWithMockFileIO() {
        System.out.println("Testing FileService with mocked FileReader and FileWriter");
        FileReader mockReader = mock(FileReader.class);
        FileWriter mockWriter = mock(FileWriter.class);
        when(mockReader.read()).thenReturn("Mock File Content");
        FileService service = new FileService(mockReader, mockWriter);
        String result = service.processFile();
        assertEquals("Processed Mock File Content", result);
    }
}
