package com.challenge.backend.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain=true)
public class UserCalorieDailyEntry {
	@JsonProperty(value="entries")
	private List<UserCalorieDetailEntry> userDailyEntries = new ArrayList<UserCalorieDetailEntry>();
    private String date;
    private Long total;
    
    public void addUserCalorieDetailEntry(UserCalorieDetailEntry entry) {
    	this.userDailyEntries.add(entry);
    }
}
