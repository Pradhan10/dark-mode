package com.challenge.backend.dao;

import com.es.challenge.domain.UserHistoryEntity;
import com.es.challenge.domain.UserHistoryEntry;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CalorieTrackingDao {
	UserHistoryEntity addUserHistory(UserHistoryEntity userHistoryEntity);
	
	List<UserHistoryEntry> viewUserHistory(Long userId);
	List<UserHistoryEntry> viewUserHistory(Long userId, Date date);
}
