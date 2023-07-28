package com.yuri.scheduler;

import com.yuri.scheduler.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchedulerApplication {

	public static void main(String[] args) {
		var context = SpringApplication.run(SchedulerApplication.class, args);
	}

}
