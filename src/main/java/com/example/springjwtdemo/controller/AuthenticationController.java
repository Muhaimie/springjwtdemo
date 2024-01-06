package com.example.springjwtdemo.controller;

import com.example.springjwtdemo.domain.AuthenticateRequest;
import com.example.springjwtdemo.domain.AuthenticationResponse;
import com.example.springjwtdemo.domain.RegisterRequest;
import com.example.springjwtdemo.service.AuthService;
import com.example.springjwtdemo.service.JWTService;
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


    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody
            RegisterRequest request
    ) {

        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(
            @RequestBody
            AuthenticateRequest authRequest
    ) {
        return ResponseEntity.ok(authService.authenticate(authRequest));
    }
}
