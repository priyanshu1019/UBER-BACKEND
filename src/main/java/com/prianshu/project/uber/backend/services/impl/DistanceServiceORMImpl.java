package com.prianshu.project.uber.backend.services.impl;

import com.prianshu.project.uber.backend.services.DistanceService;
import org.geolatte.geom.Point;
import org.springframework.stereotype.Service;

@Service
public class DistanceServiceORMImpl implements DistanceService {
    @Override
    public double calculateDistance(Point src, Point dest) {
        return 0;
    }
}
