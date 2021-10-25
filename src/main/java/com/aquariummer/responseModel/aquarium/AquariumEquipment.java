package com.aquariummer.responseModel.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class AquariumEquipment implements Serializable {

    private static final long serialVersionUID = 1L;

    /** アクアリウム用品ID **/
    @Autowired
    private int equipmentId;

    /** アクアリウム用品名 **/
    @Autowired
    private String equipmentName;

}
