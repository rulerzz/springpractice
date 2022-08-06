package com.webapp.services.dto;

public class RoadmapDTO {

    public int id;
    public String category;
    public String alias;

    public RoadmapDTO(String category, String alias, int id) {
        this.category = category;
        this.alias = alias;
        this.id = id;
    }

    public RoadmapDTO(String category, String alias) {
        this.category = category;
        this.alias = alias;
    }

    public RoadmapDTO() {
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RoadmapDTO{" +
                "category='" + category + '\'' +
                ", alias='" + alias + '\'' +
                '}';
    }
}
