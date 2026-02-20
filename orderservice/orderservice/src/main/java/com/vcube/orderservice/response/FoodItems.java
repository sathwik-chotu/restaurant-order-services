package com.vcube.orderservice.response;

import lombok.Data;

@Data
public class FoodItems {
	
	Integer id;
	String name;
	double price;
	private Restaurant restaurant;

}
