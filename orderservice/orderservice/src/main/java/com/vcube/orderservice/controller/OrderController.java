package com.vcube.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.vcube.orderservice.client.RestaurantClient;
import com.vcube.orderservice.model.Order;
import com.vcube.orderservice.repo.OrderRepo;
import com.vcube.orderservice.response.FoodItems;
import com.vcube.orderservice.response.OrderResponse;
import com.vcube.orderservice.response.Restaurant;


@RestController
public class OrderController {

	@Autowired
	private OrderRepo orderRepo;

	@Autowired
	private RestaurantClient restaurantClient;

	@PostMapping
	public Order placeOrder(@RequestBody Order order) {
		return orderRepo.save(order);
	}

	@GetMapping("/{id}")
	public ResponseEntity<OrderResponse> getOrderDetails(@PathVariable("id") int id) {
		Order order = orderRepo.findById(id).orElseThrow();
		
		Restaurant restaurant = restaurantClient.getRestaurant(order.getRestaurantId());
		List<FoodItems> foodItems = restaurantClient.getFoods(order.getRestaurantId());

		FoodItems selected = foodItems.stream().filter(f -> f.getId().equals(order.getFoodItemsId())).findFirst()
				.orElse(null);
		return ResponseEntity.ok(new OrderResponse(order.getCustomerName(), restaurant, selected));
	}

}
