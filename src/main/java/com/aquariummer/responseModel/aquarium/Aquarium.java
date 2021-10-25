package com.aquariummer.responseModel.aquarium;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.Data;

@Data
public class Aquarium {

    /** 水槽ID **/
    @Autowired
    private int aquariumId;

    /** 水槽名 **/
    @Autowired
    private String aquariumName;

    /** 水質（海水・淡水・汽水） **/
    @Autowired
    private String aquariumWaterType;

    /** 水槽の容量 **/
    @Autowired
    private int aquariumWaterSize;

    /** 水槽サイズ **/
    @Autowired
    private int aquariumSize;

    /** フィルター本体ID **/
    @Autowired
    private int filterBodyId;

    /** フィルター本体名 **/
    @Autowired
    private String filterBodyName;

    /** 濾材ID **/
    @Autowired
    private int filterMediumId;

    /** 濾材名 **/
    @Autowired
    private String filterMediumName;

    /** 低床材ID **/
    @Autowired
    private int soilId;

    /** 低床材名 **/
    @Autowired
    private String soilName;

    /** ヒーターID **/
    @Autowired
    private int heaterId;

    /** ヒーター名 **/
    @Autowired
    private String heaterName;

    /** クーラーID **/
    @Autowired
    private int coolerId;

    /** クーラー名 **/
    @Autowired
    private String coolerName;

    /** ライトID **/
    @Autowired
    private int lightId;

    /** ライト名 **/
    @Autowired
    private String lightName;

    /** 水温計ID **/
    @Autowired
    private int waterTemplatureGaugeId;

    /** 水温計名 **/
    @Autowired
    private String waterTemplatureGaugeNmae;

    /** 水温計ID **/
    @Autowired
    private int aerationId;

    /** 水温計名 **/
    @Autowired
    private String aerationName;

    /** 循環装置ID **/
    @Autowired
    private int circurationpumpId;

    /** 循環装置名 **/
    @Autowired
    private String circurationpumpName;

    /** 水槽内の魚 **/
    @Autowired
    private List<AquariumFish> aquariumFish;

    /** 水槽内の植物 **/
    @Autowired
    private List<AquariumPlant> aquariumPlant;

    /** 水槽の設備 **/
    @Autowired
    private List<AquariumEquipment> aquariumEquipment;

    /** 水槽用の品 **/
    @Autowired
    private List<AquariumChemical> aquariumChemical;
}
