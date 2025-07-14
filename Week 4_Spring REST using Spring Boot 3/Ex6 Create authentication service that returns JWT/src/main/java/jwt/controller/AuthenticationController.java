package jwt.controller;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AuthenticationController {

    private static final String SECRET = "mysecretmysecretmysecretmysecret"; // 32+ chars

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader(value = "Authorization", required = false) String authHeader) {
        if (authHeader == null || !authHeader.startsWith("Basic ")) {
            throw new RuntimeException("Missing or invalid Authorization header");
        }

        try {
            String base64Credentials = authHeader.substring("Basic ".length());
            String credentials = new String(Base64.getDecoder().decode(base64Credentials));
            String[] userDetails = credentials.split(":");

            if (userDetails.length != 2) {
                throw new RuntimeException("Invalid credential format");
            }

            String username = userDetails[0];
            String password = userDetails[1];

            if ("user".equals(username) && "pwd".equals(password)) {
                Key key = Keys.hmacShaKeyFor(SECRET.getBytes(StandardCharsets.UTF_8));

                String token = Jwts.builder()
                        .setSubject(username)
                        .setIssuedAt(new Date())
                        .setExpiration(new Date(System.currentTimeMillis() + 600_000)) // 10 min
                        .signWith(key)
                        .compact();

                Map<String, String> response = new HashMap<>();
                response.put("token", token);
                return response;
            }

        } catch (Exception e) {
            throw new RuntimeException("Error processing credentials");
        }

        throw new RuntimeException("Invalid Credentials");
    }
}
