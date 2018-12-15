package com.dh.tror;

import lombok.extern.java.Log;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@Log
public class TrorApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrorApplication.class, args);
	}

	@GetMapping("/hello")
	public String hello(){
		log.info("invoking hello controller");
		return "hello tror";
	}
}

