package com.prianshu.project.uber.backend.repositories;

import com.prianshu.project.uber.backend.entities.Ride;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<Ride,Long> {
}
