package com.bob.crypto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.bob.crypto.service.CoinsDataService;

@Component
public class ApplicationStartup implements ApplicationListener<ApplicationReadyEvent>{

	//Fetch crypto coins data from the API on start of the application
	
	@Autowired
	private CoinsDataService coinsDataService;
	
	@Override
	public void onApplicationEvent(ApplicationReadyEvent event) {
		//coinsDataService.fetchCoins();
		//coinsDataService.fetchCoinHistory(); 
	}

}
