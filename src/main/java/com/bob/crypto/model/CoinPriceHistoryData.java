package com.bob.crypto.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CoinPriceHistoryData {
	
	private String change;
	private List<CoinPriceHistoryExchangeChanges> history = new ArrayList<>();

}
