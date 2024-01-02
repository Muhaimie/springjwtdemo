package com.example.springjwtdemo.repo;

import com.example.springjwtdemo.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<User, Long> {

    Optional<User> findUserByEmail(String email);
}
