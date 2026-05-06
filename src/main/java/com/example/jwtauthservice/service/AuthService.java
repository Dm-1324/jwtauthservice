package com.example.jwtauthservice.service;

import com.example.jwtauthservice.entity.dto.JwtResponse;
import com.example.jwtauthservice.entity.dto.LoginRequest;
import com.example.jwtauthservice.entity.dto.SignUpRequest;
import org.springframework.stereotype.Service;

@Service
public interface AuthService {
    public String registerUser(SignUpRequest signUpRequest);

    public JwtResponse authenticateUser(LoginRequest loginRequest);
}
