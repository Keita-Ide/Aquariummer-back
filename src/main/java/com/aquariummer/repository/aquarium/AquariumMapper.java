package com.aquariummer.repository.aquarium;

import org.apache.ibatis.annotations.Mapper;

import com.aquariummer.requestModel.aquarium.AquariumSerchRequest;
import com.aquariummer.responseModel.aquarium.Aquarium;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface AquariumMapper {
    /**
     * ユーザー情報検索
     * @param aquariumSerchRequest 検索用リクエストデータ
     * @return アクアリウム情報
     */
	Aquarium getAquariumDetail(AquariumSerchRequest aquariumSerchRequest);
}
