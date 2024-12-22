package com.prianshu.project.uber.backend.services;

import java.sql.Driver;

//import page from springframework
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.prianshu.project.uber.backend.dto.RideRequestDto;
import com.prianshu.project.uber.backend.entities.Ride;
import com.prianshu.project.uber.backend.entities.enums.RideStatus;

public interface RideService {

    Ride getRideById(long id);

    void matchWithDriver(RideRequestDto rideRequestDto);

    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);

    Ride updateRideStatus(long rideId, RideStatus rideStatus);

    Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest);

    Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest);

}
