package com.challenge.backend.repository;

import com.es.challenge.domain.FoodEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface FoodRepository extends JpaRepository<FoodEntity, Long>{
	
	/**
	 * To fetch Food by Range
	 * @param min
	 * @param max
	 * @return
	 */
	@Query("SELECT food FROM FoodEntity food WHERE food.calories BETWEEN :min AND :max")
	List<FoodEntity> searchFoodByRange(@Param("min") int min, @Param("max") int max);

}
