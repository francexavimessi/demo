package com.example.demo;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;
@EnableAutoConfiguration
@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		
		ConfigurableApplicationContext ctx =SpringApplication.run(DemoApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		Arrays.sort(beanNames);
		
		for(String beanName :beanNames) {
			System.out.println(beanNames);
		}
		
	}

}
