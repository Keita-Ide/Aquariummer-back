package com.aquariummer.requestModel.aquarium;

import lombok.Data;

/**
 * アクアリウム情報 検索用
 */
@Data
public class AquariumSerchRequest {
  /**
   * アカウントID
   */
  private int accountId;

  /**
   * アクアリウムID
   */
  private int aquariumId;
}
