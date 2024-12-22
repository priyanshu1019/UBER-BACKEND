package com.prianshu.project.uber.backend.services;

import java.util.List;

import com.prianshu.project.uber.backend.dto.DriverDto;
import com.prianshu.project.uber.backend.dto.RideDto;
import com.prianshu.project.uber.backend.dto.RiderDto;

public interface DriverService {

    // driver id we will get from spring security context
    RideDto acceptRide(Long rideId);

    RideDto startRide(Long rideId);

    RideDto endRide(Long rideId);

    RideDto cancelRide(Long rideId);

    RiderDto rateRider(Long rideId, Integer rating);

    DriverDto getMyProfile();

    List<RideDto> getMyRides();

}
