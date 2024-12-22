package com.prianshu.project.uber.backend.dto;

import java.time.LocalDateTime;

import org.geolatte.geom.Point;
import org.hibernate.annotations.CreationTimestamp;

import com.prianshu.project.uber.backend.entities.Rider;
import com.prianshu.project.uber.backend.entities.enums.PaymentMethod;
import com.prianshu.project.uber.backend.entities.enums.RideRequestStatus;

import jakarta.persistence.Column;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestDto {

    private Long id;
    private Point pickupLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;
}
