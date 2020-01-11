package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.app.config.AppConfig;

public class WishTest {

	public static void main(String[] args) {
		System.out.println("from main method");
		
		ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		 System.out.println("container::"+ctx.getDisplayName());
		
	}

}
