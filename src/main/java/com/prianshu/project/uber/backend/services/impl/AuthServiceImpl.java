package com.prianshu.project.uber.backend.services.impl;

import org.springframework.stereotype.Service;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.SignUpDto;
import com.prianshu.project.uber.backend.dto.UserDto;
import com.prianshu.project.uber.backend.services.AuthService;

@Service
public class AuthServiceImpl implements AuthService {

    @Override
    public String login(String email, String password) {
        return "";
    }

    @Override
    public UserDto signup(SignUpDto signUpDto) {
        return null;
    }

    @Override
    public DriverDto onboardNewDriver(Long userId) {
        return null;
    }
}
