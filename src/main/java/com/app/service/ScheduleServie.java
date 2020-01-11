package com.app.service;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ScheduleServie {
	@Scheduled(fixedDelay=5000)
	public void WisgMsg() {
		
		System.out.println("good morning::"+new Date());
	}

}
