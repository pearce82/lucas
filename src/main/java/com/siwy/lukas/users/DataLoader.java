package com.siwy.lukas.users;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class DataLoader implements ApplicationRunner {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    @Override
    @Transactional
    public void run(ApplicationArguments args) throws Exception {
        if (userRepository.count() == 0) {
            User user = new User();
            user.setId(UUID.randomUUID());
            user.setEnabled(true);
            user.setNumber("siwy");
            user.setPassword(passwordEncoder.encode("siwy"));
            user.setRole("admin");
            userRepository.save(user);
        }
    }
}
