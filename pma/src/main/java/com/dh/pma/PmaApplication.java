package com.dh.pma;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.scheduling.ScheduledTasksEndpoint;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log
public class PmaApplication {

	public static void main(String[] args) {
		SpringApplication.run(PmaApplication.class, args);
	}

	@GetMapping("/hi")
	public String hi() throws Throwable{
		if( Math.random() < .25 ) {
			Thread.sleep( 5000);
			log.info("Sleeping for 5 seconds" );
			throw new RuntimeException( "Waiting too long");
		}
		log.info("invoking hi controller");
		return "hello pma";
	}
}

