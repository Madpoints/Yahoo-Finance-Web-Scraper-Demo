package com.madpoints.scraperdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.madpoints.scraperdemo.entity.Stock;
import com.madpoints.scraperdemo.service.StockService;

@Controller
@RequestMapping("/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping("/list")
	public String listStocks(Model theModel) {
		
		List<Stock> stocks = stockService.getStocks();
		
		theModel.addAttribute("stocks", stocks);
		
		return "list-stocks";
	}
	
	@GetMapping("/info")
	public String showInfo(@RequestParam("stockSymbol") String stockSymbol, 
							@RequestParam("stockName") String stockName,
							@RequestParam("stockPrice") String stockPrice,
							@RequestParam("change") String change,
							@RequestParam("percentChange") String percentChange,
							@RequestParam("volume") String volume,
							@RequestParam("avgVolume") String avgVolume,
							@RequestParam("marketCap") String marketCap,
							@RequestParam("peRatio") String peRatio,
							Model theModel) {
		
		theModel.addAttribute("stockSymbol", stockSymbol);
		theModel.addAttribute("stockName", stockName);
		theModel.addAttribute("stockPrice", stockPrice);
		theModel.addAttribute("change", change);
		theModel.addAttribute("percentChange", percentChange);
		theModel.addAttribute("volume", volume);
		theModel.addAttribute("avgVolume", avgVolume);
		theModel.addAttribute("marketCap", marketCap);
		theModel.addAttribute("peRatio", peRatio);
		
		return "stock-info";
	}
	
}
