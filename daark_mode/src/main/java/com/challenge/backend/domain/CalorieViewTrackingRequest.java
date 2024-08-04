package com.challenge.backend.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class CalorieViewTrackingRequest {
	@NotEmpty(message="This is a required field")
	private Long userId;

	private String date;	// format as MMddyyyy
}
