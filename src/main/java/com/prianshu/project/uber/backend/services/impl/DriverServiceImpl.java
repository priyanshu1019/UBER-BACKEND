package com.prianshu.project.uber.backend.services.impl;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.RideDto;
import com.prianshu.project.uber.backend.dto.RiderDto;
import com.prianshu.project.uber.backend.services.DriverService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class DriverServiceImpl implements DriverService {
    @Override
    public RideDto acceptRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto startRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto endRide(Long rideId) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public RiderDto rateRider(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public DriverDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyRides() {
        return null;
    }
}
