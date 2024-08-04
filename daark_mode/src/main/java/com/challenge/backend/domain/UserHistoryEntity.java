package com.challenge.backend.domain;

import com.es.challenge.util.CalorieTrackingUtils;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_user_calorie_tracking")
@Data
@Accessors(chain=true)
public class UserHistoryEntity {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;
	private Long foodId;
	private Date date;
	private Long calories;
	
	public UserHistoryEntity standardize() {
		if (this.date == null) this.date = CalorieTrackingUtils.getTodayDate();
		return this;
	}
	public void markAsRemovedCalories() {
		this.calories *= -1;
	}
}
