package com.prianshu.project.uber.backend.Strategies.impl;

import com.prianshu.project.uber.backend.Strategies.RideFareStrategy;
import com.prianshu.project.uber.backend.dto.RideRequestDto;

public class RideFareDefaultFareCalculationStrategyImpl implements RideFareStrategy {
    @Override
    public double calculateFare(RideRequestDto rideRequestDto) {
        return 0;
    }
}
