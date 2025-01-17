package com.challenge.backend;

import java.text.SimpleDateFormat;

public interface DarkModeConstant {
	final String REQUEST_DATE_FORMAT = "MM/dd/yyyy";
	final String RESPONSE_DATE_FORMAT = "MM/dd/yyyy";
	final SimpleDateFormat formatter = new SimpleDateFormat(REQUEST_DATE_FORMAT);
	final SimpleDateFormat displayFormatter = new SimpleDateFormat(RESPONSE_DATE_FORMAT);
}
