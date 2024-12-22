package com.prianshu.project.uber.backend.Strategies;

import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.entities.Driver;

import java.util.List;

public interface DriverMatchingStrategy {
    List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto);
}
