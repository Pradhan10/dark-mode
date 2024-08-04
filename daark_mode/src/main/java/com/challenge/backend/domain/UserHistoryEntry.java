package com.challenge.backend.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
@Accessors(chain=true)
@AllArgsConstructor
@NoArgsConstructor
public class UserHistoryEntry {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long userId;
	
	private Long foodId;
	
	@Column(name="food_name")
	private String foodName;
	
	@Column(name="date")
	private Date date;
	
	@Column(name="calories")
	private Long calories;
}
