package com.example.springjwtdemo.domain;


import lombok.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticateRequest {

    private String email;
    private String password;
}
