package com.challenge.backend.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="tbl_food")
public class FoodEntity{
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String name;
	private Integer calories;
}
