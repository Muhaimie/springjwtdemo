package com.example.springjwtdemo.service;

import com.example.springjwtdemo.domain.User;
import com.example.springjwtdemo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User saveUser(User user) {
        log.info("Saving user: {}", user);
        try {
            userRepo.save(user);
        } catch (Exception e) {
            log.error("Error when handling saving user with error message, {}", e.getLocalizedMessage());
        }
        return user;
    }

    public User findByEmail(String email) {
        log.info("Finding user by email: {}", email);
        try {
            return userRepo.findUserByEmail(email).orElseThrow();
        } catch (Exception e) {
            log.error("Error when finding user via email: , {}", e.getLocalizedMessage());
        }
        return null;
    }

}
