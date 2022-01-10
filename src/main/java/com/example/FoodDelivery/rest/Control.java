package com.example.FoodDelivery.rest;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.FoodDelivery.Repository.FoodRepository;
import com.example.FoodDelivery.domain.Food;



@RestController
@RequestMapping("/api/menu")
public class Control {
	@Autowired
	FoodRepository foodrepo;
	
	@GetMapping
	public List<Food> getAllFood(HttpServletResponse response) {
		
		return foodrepo.findAll();
	}
}
