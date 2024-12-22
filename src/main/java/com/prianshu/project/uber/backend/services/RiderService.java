package com.prianshu.project.uber.backend.services;

import java.util.List;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.RideDto;
import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.dto.RiderDto;

public interface RiderService {

    // driver id we will get from spring security context
    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getMyRides();
}
