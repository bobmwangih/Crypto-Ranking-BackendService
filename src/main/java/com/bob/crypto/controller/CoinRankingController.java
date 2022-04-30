package com.bob.crypto.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bob.crypto.model.CoinInfo;
import com.bob.crypto.model.HistoryData;
import com.bob.crypto.service.CoinsDataService;
import com.bob.crypto.utils.TimeStampUtil;

import io.github.dengliming.redismodule.redistimeseries.Sample;
import lombok.extern.slf4j.Slf4j;

@CrossOrigin(value = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/coins")
@Slf4j
public class CoinRankingController {
	@Autowired
	private CoinsDataService coinsDataService;

	@GetMapping
	public ResponseEntity<List<CoinInfo>> fetchAllCoins() {
		return ResponseEntity.ok().body(coinsDataService.fetchAllCoinsFromRedis());
	}

	@GetMapping("/{symbol}/{timePeriod}")
	public List<HistoryData> fetchCoinHistoryPerTimePeriod(@PathVariable String symbol,
			@PathVariable String timePeriod) {
		List<Sample.Value> coinsTSData = coinsDataService.fetchCoinHistoryPerTimePeriodFromRedis(symbol, timePeriod);

		List<HistoryData> coinHistory = coinsTSData.stream()
				.map(value -> new HistoryData(TimeStampUtil.convertUnixTimeToDate(value.getTimestamp()),
						TimeStampUtil.round(value.getValue(), 2)))
				.collect(Collectors.toList());
		return coinHistory;
	}
}
