# Crypto-Ranking-BackendService
**Crypto-Ranking-BackendService to expose Crypto data endpoints**

### Technologies

```js
1. SpringBoot
2. Redis -RedisTimeSeries,RedisJSON
3. Docker -Redis image
4. [CoinRanking API]https://rapidapi.com/Coinranking/api/coinranking1/
5. X-RapidAPI-Key
```

## Testing

The Application exposes two `GET` endPoints :-

1. `GET` : `/api/v1/coins` return a list of all Cryptos 

```java
[
{
uuid: "Qwsogvtv82FCd",
symbol: "BTC",
name: "Bitcoin",
color: "#f7931A",
iconUrl: "https://cdn.coinranking.com/bOabBYkcX/bitcoin_btc.svg",
marketCap: "735293847508",
price: "38645.8140897665",
listedAt: "1330214400",
tier: "1",
change: "-0.78",
rank: "1",
sparkline: [
"38949.3708342887500000000000",
"38845.3217858188135525140000",
"39012.6385973101902667990000",
"39168.0582747316186857370000",
"39067.4057608241848673490000",
"39059.2519579794348602260000",
"38897.4965149833977369410000",
"38665.0060291633709317190000",
"38632.0525823880900758610000",
"38508.8756577071353652610000",
"38488.6079394901367880010000",
"38630.5428476558166424860000",
"38603.9857764951680483980000",
"38661.0356094424156266320000",
"38681.5556930376813488960000",
"38694.1107656162514218110000",
"38766.5895572252045609640000",
"38714.1913617215183173090000",
"38702.3531024555674065880000",
"38610.7696417230462150800000",
"38714.6480722718902847770000",
"38731.7360678922043847680000",
"38715.6979375634409697430000",
"38654.6667875251709935990000",
"38660.5883109730698956390000",
"38656.2506202343141186600000",
"38645.8140897665000000000000"
],
lowVolume: false,
coinrankingUrl: "https://coinranking.com/coin/Qwsogvtv82FCd+bitcoin-btc",
_24hVolume: null,
btcPrice: "1"
},etc...]
```

2. `GET` : `/api/v1/coins/{symbol}/{timePeriod}` return a list of all timeStamps 

```js
[
{
timestamp: "2022-04-29 11:15:00",
value: 2874.79
},
{
timestamp: "2022-04-29 11:20:00",
value: 2867.77
},etc...]
```
