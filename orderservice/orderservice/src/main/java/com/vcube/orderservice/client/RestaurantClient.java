package com.vcube.orderservice.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.vcube.orderservice.response.FoodItems;
import com.vcube.orderservice.response.Restaurant;

@FeignClient(name="restaurantservice", url= "http://localhost:9999/api/v1")
public interface RestaurantClient {
	@GetMapping("/getRes/{id}")
	Restaurant getRestaurant(@PathVariable("id") int id);
	
	@GetMapping("/getItems/{id}")
	List<FoodItems>getFoods(@PathVariable("id") int id);

}
