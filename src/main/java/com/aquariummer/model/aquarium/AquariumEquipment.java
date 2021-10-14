package com.aquariummer.model.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class AquariumEquipment implements Serializable{

    private static final long serialVersionUID = 1L;

    /** ヒーター **/
    @Autowired
    private String heater;

    /** フィルター **/
    @Autowired
    private String filter;

    /** ソイル **/
    @Autowired
    private String soil;

    /** 底砂 **/
    @Autowired
    private String sand;

    /** 餌 **/
    @Autowired
    private String feeding;

    /** 薬品 **/
    @Autowired
    private String chemical;

	public AquariumEquipment() {
        this.heater = "GEX";
        this.filter = "KOTOBUKI";
        this.soil = "ADA";
        this.sand = "水作";
        this.feeding = "テトラ";
        this.chemical = "エーハイム";
	}
}
