package com.example;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.AbstractApplicationContext;

@Configuration
@ComponentScan(basePackages="com.example")
public class LearnAutoWiring {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext appContext= new AnnotationConfigApplicationContext();
		appContext.register(LearnAutoWiring.class);
		appContext.refresh();
		/*System.out.println("appContext.getBeanDefinitionNames()"+appContext.getBeanDefinitionNames());
		List<String>  beanList=Arrays.asList(appContext.getBeanDefinitionNames());
		beanList.forEach(System.out::println);*/
		CompactDisc music=(CompactDisc) appContext.getBean("sgtPeppers");
		System.out.println("Triggering Play Method");
		music.play();
		Driver driver=(Driver) appContext.getBean("driver");
		System.out.println("driver"+driver.toString());
	}
	

}
