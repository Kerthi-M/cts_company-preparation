package junit_maven;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
public class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testFindByName() {
        User user1 = new User();
        user1.setId(1L);
        user1.setName("Kerthi");

        User user2 = new User();
        user2.setId(2L);
        user2.setName("Kerthi");

        userRepository.save(user1);
        userRepository.save(user2);

        List<User> users = userRepository.findByName("Kerthi");

        assertEquals(2, users.size());
        assertEquals("Kerthi", users.get(0).getName());
        assertEquals("Kerthi", users.get(1).getName());
    }
}
