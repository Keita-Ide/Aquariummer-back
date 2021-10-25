package com.aquariummer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aquariummer.requestModel.aquarium.AquariumSerchRequest;
import com.aquariummer.requestModel.aquarium.SampleSearchRequest;
import com.aquariummer.responseModel.account.Account;
import com.aquariummer.responseModel.aquarium.Aquarium;
import com.aquariummer.responseModel.aquarium.Sample;
import com.aquariummer.service.aquarium.AquariumService;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/aquariummer")
public class RestApiController {
	/**
	 * Service
	 */
	@Autowired
	AquariumService aquariumService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Aquarium> getAquarium() {
    	List<Aquarium> aquariumList = new ArrayList<Aquarium>();
        return aquariumList;
    }

    @RequestMapping(value = "/getMyAccount", method = RequestMethod.POST)
    @ResponseBody
    public Account getMyAccount(@RequestBody(required = false) String data) {
    	System.out.println(data);
    	Account account = new Account(data);
        return account;
    }

	/**
	 * アクアリウム情報検索
	 * @param data
	 * @return アクアリウム情報
	 */
	@RequestMapping(value = "/getAquarium", method = RequestMethod.POST)
	@ResponseBody
	public Aquarium getAquariumDetail(@RequestBody AquariumSerchRequest aquariumSerchRequest) {
		Aquarium aquarium = aquariumService.getAquariumDetail(aquariumSerchRequest);
		System.out.println(aquariumSerchRequest);
		System.out.println(aquarium);
		return aquarium;
	}

  /**
   * ユーザー情報検索 DB接続テンプレート
   * @param userSearchRequest リクエストデータ
   * @return 企業情報
   */
	@ResponseBody
	@RequestMapping(value = "/user/getCompany", method = RequestMethod.POST)
	public Sample search(@RequestBody SampleSearchRequest sampleSearchRequest) {
		Sample sample = aquariumService.searchSample(sampleSearchRequest);
		System.out.println(sampleSearchRequest);
		System.out.println(sample);
		return sample;
	}
}
