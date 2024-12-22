package com.prianshu.project.uber.backend.repositories;

import com.prianshu.project.uber.backend.entities.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider,Long> {
}
