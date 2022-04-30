package com.bob.crypto.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class CoinData {

	private CoinStats stats;
	private List<CoinInfo> coins = new ArrayList<>();
}
