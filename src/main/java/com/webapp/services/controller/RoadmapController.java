package com.webapp.services.controller;

import com.webapp.services.domain.RoadmapEntity;
import com.webapp.services.dto.RoadmapDTO;
import com.webapp.services.services.RoadmapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RoadmapController {

    @Autowired
    private RoadmapService roadmapService;

    @GetMapping(value = "/roadmap" , consumes = {"application/json"})
    public ResponseEntity<List<RoadmapEntity>> getAllData(){
        List<RoadmapEntity> roadmaps = roadmapService.getAllRoadmaps();
        return new ResponseEntity<List<RoadmapEntity>>(roadmaps, HttpStatus.OK);
    }

    @PostMapping(value = "/roadmap/add" , consumes = {"application/json"})
    public ResponseEntity<RoadmapDTO> createRoadmap(@RequestBody RoadmapDTO roadmapDto){
        RoadmapDTO roadmap = roadmapService.createRoadmap(roadmapDto.getCategory(), roadmapDto.getAlias());
        return new ResponseEntity<RoadmapDTO>(roadmap, HttpStatus.CREATED);
    }

    @PutMapping(value = "/roadmap/update", consumes = {"application/json"})
    public ResponseEntity<RoadmapDTO> updateRoadmap(@RequestBody RoadmapDTO roadmapDto){
        RoadmapDTO updatedRoadmap = roadmapService.updateRoadmap(roadmapDto.getCategory(), roadmapDto.getAlias(), roadmapDto.getId());
        return new ResponseEntity<RoadmapDTO>(updatedRoadmap, HttpStatus.OK);
    }

    @DeleteMapping(value = "/roadmap/delete" , consumes = {"application/json"})
    public ResponseEntity<Integer> deleteRoadmap(@RequestParam int id){
        roadmapService.deleteRoadmap(id);
        return new ResponseEntity<>(id, HttpStatus.OK);
    }
}
