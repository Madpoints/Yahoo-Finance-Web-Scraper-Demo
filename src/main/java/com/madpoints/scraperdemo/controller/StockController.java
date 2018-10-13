package com.madpoints.scraperdemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madpoints.scraperdemo.entity.Stock;

@Controller
public class StockController {
	
	@RequestMapping("/stocks")
	public String listStocks(Model theModel) {
		
		// path to chrome webdriver exe
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\John\\careerDevs\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.finance.yahoo.com/most-active");
		
//		WebElement stockTableElement = driver.findElement(By.xpath("//table[@data-reactid='73']"));
//		List<Stock> stocks = setWebElementToStock(stockTableElement);
//		
//		for (Stock stock : stocks) {
//			System.out.println(stock.toString());
//		}
		
		List<Stock> stocks = setStocks(driver);
		
		theModel.addAttribute("stocks", stocks);
		
		return "list-stocks";
	}
	
	public static List<Stock> setWebElementToStock(WebElement webElement) {
		
		List<Stock> stocks = new ArrayList<Stock>();
		
		setStockSymbol(stocks, webElement);
		
		return stocks;
	}
	
	public static void setStockSymbol(List<Stock> stocks, WebElement webElement) {
		
		List<WebElement> stockSymbolElements = webElement.findElements(By.xpath("//td[@aria-label='Symbol']"));
		
		for (WebElement stockSymbol : stockSymbolElements) {
			
			Stock tempStock = new Stock();
			tempStock.setSymbol(stockSymbol.getText());
			stocks.add(tempStock);
		}
	}
	
	public static List<Stock> setStocks(WebDriver driver) {
		
		List<WebElement> stockSymbolElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Symbol']"));
		List<WebElement> stockNameElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Name']"));
		List<WebElement> stockPriceElements = driver.findElements(By.xpath("//table[@data-reactid='73']//td[@aria-label='Price (Intraday)']"));
		
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
		
		return stocks;
	}

}
