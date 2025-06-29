package maven_work;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class UserServiceTest {

    @MockBean
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @Test
    public void testGetUserById() {
        User user = new User();
        user.setId(2L);
        user.setName("Bob");

        Mockito.when(userRepository.findById(2L)).thenReturn(Optional.of(user));

        User result = userService.getUserById(2L);
        assertEquals("Bob", result.getName());
    }
}
