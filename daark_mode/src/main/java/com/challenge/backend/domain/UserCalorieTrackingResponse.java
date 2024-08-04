package com.challenge.backend.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain=true)
public class UserCalorieTrackingResponse {
	private List<UserCalorieDailyEntry> userCalorieDailyTracking = new ArrayList<UserCalorieDailyEntry>();
	
	public void addUserCalorieDailyEntry(UserCalorieDailyEntry entry) {
		this.userCalorieDailyTracking.add(entry);
	}
}
