package com.vicsystems.DesignPatterns.CreationalDesignPatterns.Builder.HouseExample;

public interface HouseBuilder {
    void buildFoundation();
    void buildStructure();
    void buildRoof();
    void paintHouse();
    void furnishHouse();
    House getHouse();
}