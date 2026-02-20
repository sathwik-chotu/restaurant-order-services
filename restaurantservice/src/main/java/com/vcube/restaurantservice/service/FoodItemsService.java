package com.vcube.restaurantservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.restaurantservice.model.FoodItems;
import com.vcube.restaurantservice.repo.FoodItemsRepo;

@Service
public class FoodItemsService {
	
	@Autowired
	FoodItemsRepo foodItemsRepo;
	public FoodItems createFoodItems(FoodItems foodItems) {
		return foodItemsRepo.save(foodItems);
	}
	public List<FoodItems> findByRestaurantId(long rid) {
		return foodItemsRepo.findByRestaurantId(rid);
	}

}
