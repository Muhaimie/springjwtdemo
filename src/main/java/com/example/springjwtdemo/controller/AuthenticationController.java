package com.example.springjwtdemo.controller;

import com.example.springjwtdemo.domain.AuthenticationResponse;
import com.example.springjwtdemo.domain.RegisterRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody
            RegisterRequest request
    ) {
//        TODO: implement login on register user and returns token
    }
}
