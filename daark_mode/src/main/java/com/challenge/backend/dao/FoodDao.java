package com.challenge.backend.dao;

import com.es.challenge.domain.FoodEntity;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FoodDao {
	List<FoodEntity> getFoods();
	List<FoodEntity> getFoods(Integer caloriesMin, Integer caloriesMax);
	Boolean addFood(FoodEntity food);
	Boolean removeFood(Long foodId);
}
