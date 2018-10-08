package com.madpoints.scraperdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockController {
	
	@RequestMapping("/stocks")
	public String listStocks(Model theModel) {
		
		return "stocks";
	}

}
