package com.labC.libraryCheckoutSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryCheckoutSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(LibraryCheckoutSystemApplication.class, args);
	}

}
 class UserController{


	private String name;
	public String id;

	public UserController(String name, String id){
		this.name = name;
		this.id = id;
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getId(){
	return id;
}

	public void setId(String id) {
		this.id = id;
	}
}

