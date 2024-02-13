package com.example.mockAPI;

import com.example.mockAPI.Repositories.SeedData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class MockApiApplication {

	public static void main(String[] args) {
		SeedData.SeedData();
		SpringApplication.run(MockApiApplication.class, args);
	}
}
