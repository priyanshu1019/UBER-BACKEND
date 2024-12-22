package com.prianshu.project.uber.backend.services;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.SignUpDto;
import com.prianshu.project.uber.backend.dto.UserDto;

public interface AuthService {

    // this will return a token
    String login(String email, String password);

    // this will re
    UserDto signup(SignUpDto signUpDto);

    // this is to make a new driver
    DriverDto onboardNewDriver(Long userId);
}
