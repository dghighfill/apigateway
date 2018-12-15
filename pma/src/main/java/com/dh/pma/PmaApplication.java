package com.dh.pma;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
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
	public String hi(){
		log.info("invoking hi controller");
		return "hello pma";
	}

}

