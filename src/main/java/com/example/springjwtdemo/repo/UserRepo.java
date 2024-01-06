package com.example.springjwtdemo.repo;

import com.example.springjwtdemo.domain.AppUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepo extends JpaRepository<AppUser, Long>  {

    Optional<AppUser> findUserByEmail(String email);
    Optional<AppUser> findUserByUsername(String firstname);
}
