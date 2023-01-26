package com.practice.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice_DI_DemoApp {
	
	public static void main(String[] args) {
		
		
		
					// read spring config file
					ClassPathXmlApplicationContext context = 
							new ClassPathXmlApplicationContext("applicationContext.xml");
					
					// get bean from spring container			
					Engine theEngine = context.getBean(Engine.class);
					
					//call a method on bean.
					System.out.println(theEngine.startengine());
					
					// call a method to get feedback from mechanic.
					System.out.println(theEngine.getFeedback());
					
					//close the context
					context.close();
					
					
					
		
	}
			
			
			
			

}
