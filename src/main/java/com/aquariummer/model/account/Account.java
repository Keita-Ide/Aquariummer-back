package com.aquariummer.model.account;

import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Account {

    private static final long serialVersionUID = 1L;

    /** アカウントID **/
    @Autowired
    private String accountId;

    /** 名字 **/
    @Autowired
    private String lastName;

    /** 名前 **/
    @Autowired
    private String firstName;

    /** 課金プラン **/
    @Autowired
    private String chargePlan;

	public Account(String data) {
		System.out.println(data);
        JSONObject jsonObj = new JSONArray(data).getJSONObject(0);
        this.accountId = jsonObj.getString("accountId");
        this.lastName = "未定義！！";
        this.firstName = "未定義！！";
        this.chargePlan = "しまうまプラン";
	}
}
