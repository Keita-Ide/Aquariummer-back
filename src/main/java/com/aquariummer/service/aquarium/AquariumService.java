package com.aquariummer.service.aquarium;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aquariummer.repository.aquarium.SampleMapper;
import com.aquariummer.requestModel.aquarium.SampleSearchRequest;
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
     * ユーザー情報検索
　　　* @param userSearchRequest リクエストデータ
     * @return 検索結果
     */
    public Sample search(SampleSearchRequest userSearchRequest) {
        return sampleMapper.search(userSearchRequest);
    }
}