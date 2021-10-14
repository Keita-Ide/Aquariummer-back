package com.aquariummer.model.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AquariumFish implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 魚名 **/
    @Autowired
    private String fishName;

    /** 魚数 **/
    @Autowired
    private String fishNumber;

    public AquariumFish() {
    	this.fishName = "コリドラス";
    	this.fishNumber = "5";
    }
}
