package com.webapp.services.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "roadmap-types")
public class RoadmapEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "category")
    private String category;

    @Column(name = "alias")
    private String alias;

    public RoadmapEntity(String category, String alias, int id) {
        this.category = category;
        this.alias = alias;
        this.id = id;
    }

    public RoadmapEntity(String category, String alias) {
        this.category = category;
        this.alias = alias;
    }

    public RoadmapEntity() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    @Override
    public String toString() {
        return "RoadmapEntity{" +
                "id=" + id +
                ", category='" + category + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
