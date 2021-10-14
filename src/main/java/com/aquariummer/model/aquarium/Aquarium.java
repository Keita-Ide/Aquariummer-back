package com.aquariummer.model.aquarium;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Aquarium implements Serializable{

    private static final long serialVersionUID = 1L;

    /** 水槽名 **/
    @Autowired
    private String aquariumName;

    /** 水質（海水・淡水・汽水） **/
    @Autowired
    private String aquariumWater;

    /** 水槽サイズ **/
    @Autowired
    private String aquariumSize;

    /** 水槽の容量 **/
    @Autowired
    private String aquariumWaterSize;

    /** 水槽内の魚 **/
    @Autowired
    private List<AquariumFish> fishNamesNumbers;

    /** 水槽の設備 **/
    @Autowired
    private AquariumEquipment aquariumEquipment;

	public Aquarium() {
        this.aquariumName = "コリドラス水槽";
        this.aquariumWater = "汽水";
        this.aquariumSize = "45";
        this.aquariumWaterSize = "16";
        this.fishNamesNumbers = new ArrayList<AquariumFish>();
        this.fishNamesNumbers.add(new AquariumFish());
        this.aquariumEquipment = new AquariumEquipment();
	}
}
