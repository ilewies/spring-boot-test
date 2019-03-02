package com.example.spring_second;

import com.example.spring_second.service.TestService;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@AllArgsConstructor
public class DemoApplication implements CommandLineRunner {
    private final TestService testService;
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
    @Override
    public void run(String... strings) throws Exception {
        testService.doPrint();
    }
}
