package com.bob.crypto.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CoinInfo {

	private String uuid;
	private String symbol;
	private String name;
	private String color;
	private String iconUrl;
	private String marketCap;
	private String price;
	private String listedAt;
	private String tier;
	private String change;
	private String rank;
	private List<String> sparkline = new ArrayList<>();
	private Boolean lowVolume;
	private String coinrankingUrl;
	private String _24hVolume;
	private String btcPrice;
}
