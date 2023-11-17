package com.shaon.highscalatondemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "com.shaon.highscalatondemo")
public class HighScalatonDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HighScalatonDemoApplication.class, args);
	}

}
