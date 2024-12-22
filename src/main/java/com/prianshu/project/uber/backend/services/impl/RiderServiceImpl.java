package com.prianshu.project.uber.backend.services.impl;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.RideDto;
import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.dto.RiderDto;
import com.prianshu.project.uber.backend.services.RiderService;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class RiderServiceImpl implements RiderService {
    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        return null;
    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getMyRides() {
        return null;
    }
}
