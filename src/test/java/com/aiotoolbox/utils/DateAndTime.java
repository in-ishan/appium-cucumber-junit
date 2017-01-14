package com.aiotoolbox.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateAndTime {
	
	Date date = new Date();
	DateFormat format = new SimpleDateFormat("dd-MMM-yyyy hh:mm:ss");
	
	public String getCurrentDateAndTime()
	{
		System.out.println(format.format(date));
		return format.format(date);
	}

}
