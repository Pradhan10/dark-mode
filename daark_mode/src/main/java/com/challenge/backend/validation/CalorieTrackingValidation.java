package com.challenge.backend.validation;

import com.es.challenge.domain.CalorieViewTrackingRequest;

public interface CalorieTrackingValidation {
	boolean isValidCalorieTrackingRequest(CalorieViewTrackingRequest request);
}
