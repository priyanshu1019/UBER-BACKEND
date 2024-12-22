package com.prianshu.project.uber.backend.dto;

import java.time.LocalDateTime;

import org.geolatte.geom.Point;

import com.prianshu.project.uber.backend.entities.Rider;
import com.prianshu.project.uber.backend.entities.enums.PaymentMethod;
import com.prianshu.project.uber.backend.entities.enums.RideStatus;

public class RideDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime createdTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}
