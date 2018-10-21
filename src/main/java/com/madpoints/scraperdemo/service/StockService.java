package com.madpoints.scraperdemo.service;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Service;

import com.madpoints.scraperdemo.entity.Stock;

@Service
public class StockService {
	
	public List<Stock> getStocks() {
		
		// path to chrome webdriver exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\John\\careerDevs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.finance.yahoo.com/most-active");
		
		List<Stock> stocks = setStocks(driver);
		
		driver.quit();
		
		return stocks;
	}
	
	private static List<Stock> setStocks(WebDriver driver) {
		
		List<WebElement> stockSymbolElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Symbol']"));
		List<WebElement> stockNameElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Name']"));
		List<WebElement> stockPriceElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Price (Intraday)']"));
		List<WebElement> stockChangeElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Change']"));
		List<WebElement> stockPercentChangeElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='% Change']"));
		List<WebElement> stockVolumeElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Volume']"));
		List<WebElement> stockAvgVolumeElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Avg Vol (3 month)']"));
		List<WebElement> stockMarketCapElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Market Cap']"));
		List<WebElement> stockPeRatioElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='PE Ration (TTM)']"));


		
		List<Stock> stocks = new ArrayList<Stock>();
		
		int size = stockSymbolElements.size();
		int listIndex = 0;
		
		for (int index = 0; index < size; index++) {
			
			Stock tempStock = new Stock();
			stocks.add(index, tempStock);
			
		}
		
		for (WebElement stockSymbolElement : stockSymbolElements) {
			
			stocks.get(listIndex).setSymbol(stockSymbolElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockNameElement : stockNameElements) {
			
			stocks.get(listIndex).setName(stockNameElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockPriceElement : stockPriceElements) {
			
			stocks.get(listIndex).setPrice(stockPriceElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockChangeElement : stockChangeElements) {
			
			stocks.get(listIndex).setChange(stockChangeElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockPercentChangeElement : stockPercentChangeElements) {
			
			stocks.get(listIndex).setPercentChange(stockPercentChangeElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockVolumeElement : stockVolumeElements) {
			
			stocks.get(listIndex).setVolume(stockVolumeElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockAvgVolumeElement : stockAvgVolumeElements) {
			
			stocks.get(listIndex).setAvgVolume(stockAvgVolumeElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockMarketCapElement : stockMarketCapElements) {
			
			stocks.get(listIndex).setMarketCap(stockMarketCapElement.getText());
			listIndex++;
			
		}
		
		listIndex = 0;
		
		for (WebElement stockPeRatioElement : stockPeRatioElements) {
			
			stocks.get(listIndex).setPeRatio(stockPeRatioElement.getText());
			listIndex++;
			
		}
		
		return stocks;
	}

}
