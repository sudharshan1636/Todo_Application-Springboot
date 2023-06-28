package com.vit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vit.service.TodoService;

@SpringBootApplication
public class TodoManagementApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(TodoManagementApplication.class, args);
		//System.out.println(applicationContext);		
		//TodoService service = applicationContext.getBean(TodoService.class);
		//System.out.println(service);
		// TODO custom login and register pages Integration. 
	}

}
