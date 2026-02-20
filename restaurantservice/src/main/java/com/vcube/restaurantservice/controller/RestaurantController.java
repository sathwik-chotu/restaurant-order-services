package com.vcube.restaurantservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.restaurantservice.model.FoodItems;
import com.vcube.restaurantservice.model.Restaurant;
import com.vcube.restaurantservice.service.FoodItemsService;
import com.vcube.restaurantservice.service.RestaurantService;

@RestController
@RequestMapping("api/v1")
public class RestaurantController {
	
	@Autowired
	RestaurantService restaurantService;
	
	@Autowired
	FoodItemsService foodItemsService;
	
	@PostMapping("addRes")
	Restaurant createRestaurantInfo(@RequestBody Restaurant restaurant) {
		return restaurantService.createRestaurant(restaurant);
	}
	
	@GetMapping("getRes/{id}") 
		Restaurant getRestaurantInfo(@PathVariable int id) {
		return restaurantService.getRestaurantInfo(id);
	}
	
	@PostMapping("addItems")
	FoodItems addFoodItems(@RequestBody FoodItems foodItems) {
		return foodItemsService.createFoodItems(foodItems);
	}
	
	@GetMapping("getItems/{id}")
	List<FoodItems>getItems(@PathVariable int id) {
		return foodItemsService.findByRestaurantId(id);
	}

}
