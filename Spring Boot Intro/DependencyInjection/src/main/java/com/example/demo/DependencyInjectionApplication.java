package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyInjectionApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependencyInjectionApplication.class, args);
		
		Alien a1 = context.getBean(Alien.class);
		a1.show();
		
		
		Alien a2 = context.getBean(Alien.class);
		a2.show();
		
		// if you have not called @Scope(value="prototype") on the Alien class,
		// this returns:
		/* 
		  	Object created...
		  	in show
		 	in show
		 */
		
		// this is b/c Spring follow the Singleton Creational Pattern, allowing only one instantiation of a class
		// 
		
	}

}
