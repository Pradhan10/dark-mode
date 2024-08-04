package com.challenge.backend.service;

import com.es.challenge.domain.*;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface FoodManagementService {
	public List<Food> getFoods();
	public List<Food> getFoods(Integer caloriesMin, Integer caloriesMax);
	public Boolean addFood(Food food);
	public Boolean removeFood(Long foodId);
}
