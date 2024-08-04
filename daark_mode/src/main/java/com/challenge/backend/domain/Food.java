package com.challenge.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Food implements Serializable{
	private static final long serialVersionUID = -4087970586697604468L;

	private Long id;
	private String name;
	private Long calories;
}
