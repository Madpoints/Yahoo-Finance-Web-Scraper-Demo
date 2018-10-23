package com.madpoints.scraperdemo.entity;

public class Stock {
	
	private String symbol;
	private String name;
	private String price;
	private String change;
	private String percentChange;
	private String volume;
	private String avgVolume;
	private String marketCap;
	private String peRatio;
	
	public Stock() {
	}

	public Stock(String symbol, String name) {
		this.symbol = symbol;
		this.name = name;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getChange() {
		return change;
	}

	public void setChange(String change) {
		this.change = change;
	}

	public String getPercentChange() {
		return percentChange;
	}

	public void setPercentChange(String percentChange) {
		this.percentChange = percentChange;
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume;
	}

	public String getAvgVolume() {
		return avgVolume;
	}

	public void setAvgVolume(String avgVolume) {
		this.avgVolume = avgVolume;
	}

	public String getMarketCap() {
		return marketCap;
	}

	public void setMarketCap(String marketCap) {
		this.marketCap = marketCap;
	}

	public String getPeRatio() {
		return peRatio;
	}

	public void setPeRatio(String peRatio) {
		this.peRatio = peRatio;
	}

	@Override
	public String toString() {
		return "Stock [symbol= " + symbol + ", name= " + name + ", price= " + price + "]";
	}

}
