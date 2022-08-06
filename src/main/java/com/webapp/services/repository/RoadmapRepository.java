package com.webapp.services.repository;

import com.webapp.services.domain.RoadmapEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadmapRepository extends JpaRepository<RoadmapEntity, Integer> {

}