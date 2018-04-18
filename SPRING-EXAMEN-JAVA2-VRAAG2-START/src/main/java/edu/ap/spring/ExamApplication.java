package edu.ap.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExamApplication {
	Exam exam;
	
	@Autowired
	public void setExam(Exam exam) {
		this.exam = exam;
	}

	@Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return (args) -> {
		
		};
    }
	
	public static void main(String[] args) {
		SpringApplication.run(ExamApplication.class, args);
	}
}