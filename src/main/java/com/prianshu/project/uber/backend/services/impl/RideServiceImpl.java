package com.prianshu.project.uber.backend.services.impl;

import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.entities.Ride;
import com.prianshu.project.uber.backend.entities.enums.RideStatus;
import com.prianshu.project.uber.backend.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.sql.Driver;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(long id) {
        return null;
    }

    @Override
    public void matchWithDriver(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
