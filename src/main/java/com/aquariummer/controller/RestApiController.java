package com.aquariummer.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.aquariummer.model.account.Account;
import com.aquariummer.model.aquarium.Aquarium;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/aquariummer")
public class RestApiController {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public List<Aquarium> getAquarium() {
    	List<Aquarium> aquariumList = new ArrayList<Aquarium>();
    	Aquarium aquarium = new Aquarium();
    	aquariumList.add(aquarium);
    	// test code bellow
    	Aquarium aquarium2 = new Aquarium();
    	aquariumList.add(aquarium2);
    	Aquarium aquarium3 = new Aquarium();
    	aquariumList.add(aquarium3);
    	Aquarium aquarium4 = new Aquarium();
    	aquariumList.add(aquarium4);
    	Aquarium aquarium5 = new Aquarium();
    	aquariumList.add(aquarium5);
    	Aquarium aquarium6 = new Aquarium();
    	aquariumList.add(aquarium6);
    	Aquarium aquarium7 = new Aquarium();
    	aquariumList.add(aquarium7);
    	Aquarium aquarium8 = new Aquarium();
    	aquariumList.add(aquarium8);
    	Aquarium aquarium9 = new Aquarium();
    	aquariumList.add(aquarium9);
        return aquariumList;
    }

    @RequestMapping(value = "/getMyAccount", method = RequestMethod.POST)
    @ResponseBody
    public Account getMyAccount(@RequestBody(required = false) String data) {
    	System.out.println(data);
    	Account account = new Account(data);
        return account;
    }
}
