package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


/*
	@Component //specifies class as a "Spring Bean"... is "Singleton" design pattern by default
	@Scope(value="prototype") 
	- implements "Prototype" design pattern
	- this makes it so you ONLY get object when you call getBean; you also get a deep copy every time you clone;
*/

@Component 
public class Alien {
	
	//variables
	private int aid;
	private String name;
	private String tech;
	@Autowired // since Alien is dependent on Laptop, we need this to "autowire" them; it searches by type -- in this case, Laptop
	@Qualifier("lap1") // if we add a name to the "Laptop" component (see Laptop.java), we can search by name instead of type (still need to include "@Autowired" above)
	private Laptop laptop;
	
	// for clone
	public Alien() {
		super();
		System.out.println("object created");
	}
	
	// Alien getters and setters
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	// Laptop getters and setters
	public Laptop getLaptop() {
		return laptop;
	}

	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	// Additional Methods
	public void show() {
		System.out.println("in show");
		laptop.compile();
	}
	
}
