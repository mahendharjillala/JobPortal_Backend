package com.sunless.JobPort;

import com.sunless.JobPort.model.JobPost;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class JobPortApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortApplication.class, args);
	}
}
