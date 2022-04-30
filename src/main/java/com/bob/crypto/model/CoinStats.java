package com.bob.crypto.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CoinStats {

	private float total;
	//this
	//private float referenceCurrencyRate;
	private float totalCoins;
	private float totalMarkets;
	private float totalExchanges;
	private String totalMarketCap;
	private String total24hVolume;
	//from here
	//private float btcDominance;
	//private List<CoinInfo> bestCoins = new ArrayList<>();
	//private List<CoinInfo> newestCoins = new ArrayList<>();
}
