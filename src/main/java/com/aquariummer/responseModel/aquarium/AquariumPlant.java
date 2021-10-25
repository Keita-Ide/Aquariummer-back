package com.aquariummer.responseModel.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class AquariumPlant implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 植物ID **/
    @Autowired
    private int plantId;

    /** 植物名 **/
    @Autowired
    private String plantName;

    /** 植物の学名 **/
    @Autowired
    private String plantScientificName;

    /** 植物数 **/
    @Autowired
    private int plantNumber;
}
