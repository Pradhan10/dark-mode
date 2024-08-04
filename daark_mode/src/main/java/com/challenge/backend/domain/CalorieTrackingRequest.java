package com.challenge.backend.domain;

import lombok.Data;
import org.hibernate.validator.constraints.NotEmpty;

@Data
public class CalorieTrackingRequest extends CalorieViewTrackingRequest {
	@NotEmpty(message="This is a required field")
	private Long foodId;
	
	@NotEmpty(message="This is a required field")
	private Integer calories;
}
