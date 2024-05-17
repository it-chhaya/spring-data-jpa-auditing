package co.istad.jpa.auditing;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@RequiredArgsConstructor
public class SpringDataJpaAuditingApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaAuditingApplication.class, args);
    }

    private final UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setUsername("chhaya");
        user.setPassword("pwd");
        userRepository.save(user);
    }
}
