package com.prianshu.project.uber.backend.Strategies;

import com.prianshu.project.uber.backend.dto.RideRequestDto;

public interface RideFareStrategy {
    double calculateFare(RideRequestDto rideRequestDto);
}
