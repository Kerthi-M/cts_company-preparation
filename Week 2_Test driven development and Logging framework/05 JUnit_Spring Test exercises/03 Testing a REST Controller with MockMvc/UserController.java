package junit_maven;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping("/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id) {
        User user = new User();
        user.setId(id);
        user.setName("Alice");
        return ResponseEntity.ok(user);
    }
}
