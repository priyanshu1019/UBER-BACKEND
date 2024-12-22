package com.prianshu.project.uber.backend.repositories;

import com.prianshu.project.uber.backend.entities.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Long> {
}
