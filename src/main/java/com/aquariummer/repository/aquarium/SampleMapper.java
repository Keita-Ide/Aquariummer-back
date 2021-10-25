package com.aquariummer.repository.aquarium;

import org.apache.ibatis.annotations.Mapper;

import com.aquariummer.requestModel.aquarium.SampleSearchRequest;
import com.aquariummer.responseModel.aquarium.Sample;
/**
 * ユーザー情報 Mapper
 */
@Mapper
public interface SampleMapper {
    /**
     * ユーザー情報検索
     * @param user 検索用リクエストデータ
     * @return ユーザー情報
     */
    Sample searchSample(SampleSearchRequest user);
}
