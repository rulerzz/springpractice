package com.webapp.services.services;

import com.webapp.services.domain.RoadmapEntity;
import com.webapp.services.dto.RoadmapDTO;
import com.webapp.services.repository.RoadmapRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoadmapService {

    @Autowired
    private RoadmapRepository roadmapRepository;

    public List<RoadmapEntity> getAllRoadmaps(){
        return roadmapRepository.findAll();
    }

    public RoadmapDTO createRoadmap(String category, String alias){
        RoadmapEntity object = new RoadmapEntity(category, alias);
        RoadmapDTO dto = new RoadmapDTO(category, alias);
        roadmapRepository.save(object);
        return dto;
    }

    public RoadmapDTO updateRoadmap(String category, String alias, int id){
        Optional<RoadmapEntity> oldEntity = roadmapRepository.findById(id);
        RoadmapEntity roadmapEntity = oldEntity.get();
        roadmapEntity.setCategory(category);
        roadmapEntity.setAlias(alias);
        roadmapRepository.saveAndFlush(roadmapEntity);
        return new RoadmapDTO(category, alias, id);
    }

    public void deleteRoadmap(int id){
        roadmapRepository.deleteById(id);
    }
}
