package com.prianshu.project.uber.backend.Strategies.impl;

import com.prianshu.project.uber.backend.Strategies.DriverMatchingStrategy;
import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.entities.Driver;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //because business logic
public class DriverMatchingNearestDriverStrategyImpl implements DriverMatchingStrategy {

    @Override
    public List<Driver> findMatchingDrivers(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
