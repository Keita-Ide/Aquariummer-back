package com.aquariummer.requestModel.aquarium;

import java.io.Serializable;

import lombok.Data;

/**
 * ユーザー情報 検索用リクエストデータ
 */
@Data
public class SampleSearchRequest implements Serializable {
  /**
   * アカウントID
   */
  private int accountId;
}
