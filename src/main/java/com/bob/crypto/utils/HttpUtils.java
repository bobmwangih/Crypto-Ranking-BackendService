package com.bob.crypto.utils;

import java.util.Collections;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class HttpUtils {

	private static String apiHost = "coinranking1.p.rapidapi.com";
	//put in your XRaoid-API KEy
	private static String apiKey = "";
	
	public static HttpEntity<String> getHttpEntity(){
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));
		headers.set("X-RapidAPI-Host", apiHost);
		headers.set("X-RapidAPI-Key", apiKey);
		
		return new HttpEntity<>(null,headers);
	}
}
