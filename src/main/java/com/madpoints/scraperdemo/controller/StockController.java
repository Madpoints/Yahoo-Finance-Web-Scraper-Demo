package com.madpoints.scraperdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.madpoints.scraperdemo.entity.Stock;
import com.madpoints.scraperdemo.service.StockService;

@Controller
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@RequestMapping("/stocks")
	public String listStocks(Model theModel) {
		
		List<Stock> stocks = stockService.getStocks();
		
		theModel.addAttribute("stocks", stocks);
		
		return "list-stocks";
	}
	
}
