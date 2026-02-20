package com.vcube.restaurantservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vcube.restaurantservice.model.Restaurant;
import com.vcube.restaurantservice.repo.RestaurantRepo;

@Service
public class RestaurantService {

	@Autowired
	RestaurantRepo restaurantRepo;

	public Restaurant createRestaurant(Restaurant restaurant) {
		return restaurantRepo.save(restaurant);
	}
	public Restaurant getRestaurantInfo(int id) {
		return restaurantRepo.findById(id).orElseThrow();
	}

}
