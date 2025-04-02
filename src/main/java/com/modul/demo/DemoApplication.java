package com.modul.demo;

import com.modul.demo.documentation.DocumentationService;
import com.modul.demo.documentation.internal.Documentation;
import com.modul.demo.todo.internal.Todo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

}
