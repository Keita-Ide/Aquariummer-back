package com.aquariummer.responseModel.aquarium;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class AquariumChemical implements Serializable {

    private static final long serialVersionUID = 1L;

    /** 薬品ID **/
    @Autowired
    private int chemicalId;

    /** 薬品名 **/
    @Autowired
    private String chemicalName;

}
