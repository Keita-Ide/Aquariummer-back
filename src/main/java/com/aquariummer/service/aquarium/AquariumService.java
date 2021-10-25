package com.aquariummer.service.aquarium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquariummer.repository.aquarium.AquariumMapper;
import com.aquariummer.repository.aquarium.SampleMapper;
import com.aquariummer.requestModel.aquarium.AquariumSerchRequest;
import com.aquariummer.requestModel.aquarium.SampleSearchRequest;
import com.aquariummer.responseModel.aquarium.Aquarium;
import com.aquariummer.responseModel.aquarium.Sample;

/**
 * ユーザー情報 Service
 */
@Service
public class AquariumService {
    /**
     * ユーザー情報 Mapper
     */
    @Autowired
    private SampleMapper sampleMapper;
    /**
     * アクアリウム情報 Mapper
     */
    @Autowired
    private AquariumMapper aquariumMapper;
    /**
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public Sample searchSample(SampleSearchRequest userSearchRequest) {
        return sampleMapper.searchSample(userSearchRequest);
    }

	public Aquarium getAquariumDetail(AquariumSerchRequest aquariumSerchRequest) {
        return aquariumMapper.getAquariumDetail(aquariumSerchRequest);
	}
}