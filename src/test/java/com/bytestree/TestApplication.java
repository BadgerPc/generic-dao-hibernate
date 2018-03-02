package com.bytestree;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.bytestree.config.AppConfiguration;

public class TestApplication {

	public static void main(String[] args) {
		// Load the Spring context and beans
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
	    MyApplication app = context.getBean(MyApplication.class);

	    app.performDbTasks();

	    context.close();
	}
	
    
}
