package com.multi;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {
	
             //초 분 시 일 월 요일
	//cron = "*  *  *  *  *  *"   
	
	//15초마다 스스로 동작함
//	@Scheduled(cron = "* * */15 * * *")
//	public void myScheduler1() {
//		System.out.println("Start My Scheduler1 ....");
//		System.out.println("End My Scheduler1 ....");
//	}
//	
	//30초마다 스스로 동작함
//	@Scheduled(cron = "* * */30 * * *")
//	public void myScheduler2() {
//		System.out.println("Start My Scheduler2 ....");
//		System.out.println("End My Scheduler2 ....");
//	}


}