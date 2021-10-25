package com.aquariummer.responseModel.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class AquariumFish implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 魚ID **/
    @Autowired
    private int fishId;

    /** 魚名 **/
    @Autowired
    private String fishName;

    /** 魚マスタの情報 **/
    @Autowired
    private String fishScientificName;

    /** 魚数 **/
    @Autowired
    private int fishNumber;
}
