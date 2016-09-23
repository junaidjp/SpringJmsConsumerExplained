package com.bov.dto;

import java.io.Serializable;

public class Stock implements Serializable {
	int stockId;
	String stockName;
	String stockDescription;
	int stockQuantity;
	double startingPrice;
	double endingPrice;
	
	
	public Stock(int stockId, String stockName, String stockDescription,
			int stockQuantity, double startingPrice, double endingPrice
			) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.stockDescription = stockDescription;
		this.stockQuantity = stockQuantity;
		this.startingPrice = startingPrice;
		this.endingPrice = endingPrice;
		
	}
	
	
	
	public int getStockId() {
		return stockId;
	}
	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getStockDescription() {
		return stockDescription;
	}
	public void setStockDescription(String stockDescription) {
		this.stockDescription = stockDescription;
	}
	public int getStockQuantity() {
		return stockQuantity;
	}
	public void setStockQuantity(int stockQuantity) {
		this.stockQuantity = stockQuantity;
	}
	public double getStartingPrice() {
		return startingPrice;
	}
	public void setStartingPrice(double startingPrice) {
		this.startingPrice = startingPrice;
	}
	public double getEndingPrice() {
		return endingPrice;
	}
	public void setEndingPrice(double endingPrice) {
		this.endingPrice = endingPrice;
	}
	
	

}
