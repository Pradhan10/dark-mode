package com.challenge.backend.service.impl;

import com.es.challenge.service.ESAuthService;
import org.springframework.stereotype.Service;

@Service
public class ESAuthServiceImpl implements ESAuthService {

	@Override
	public boolean isAdmin(String key) {
		return "admin".equals(key);
	}

}
