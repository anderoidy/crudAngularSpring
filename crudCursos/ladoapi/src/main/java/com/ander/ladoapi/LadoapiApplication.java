package com.ander.ladoapi;

import com.ander.ladoapi.model.Course;
import com.ander.ladoapi.repository.CourseRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LadoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LadoapiApplication.class, args);
	}


    @Bean
    CommandLineRunner initDatabase(CourseRepository courseRepository) {
		return args -> {
			courseRepository.deleteAll();

//sssss
			Course c = new Course();
			c.setName("Angular com Spring");
			c.setCategory("front-end");

			Course c1 = new Course();
			c1.setName("React");
			c1.setCategory("front-end");

			courseRepository.save(c);
			courseRepository.save(c1);
		};
	}
}
