package com.example.springjwtdemo.service;

import com.example.springjwtdemo.domain.AppUser;
import com.example.springjwtdemo.repo.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@Transactional
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public AppUser saveUser(AppUser appUser) {
        log.info("Saving user: {}", appUser);
        try {
            userRepo.save(appUser);
        } catch (Exception e) {
            log.error("Error when handling saving user with error message, {}", e.getLocalizedMessage());
        }
        return appUser;
    }

    public AppUser findByEmail(String email) {
        log.info("Finding user by email: {}", email);
        try {
            return userRepo.findUserByEmail(email).orElseThrow();
        } catch (Exception e) {
            log.error("Error when finding user via email: , {}", e.getLocalizedMessage());
        }
        return null;
    }

}
