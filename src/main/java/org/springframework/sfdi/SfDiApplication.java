package org.springframework.sfdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.sfdi.controllers.ConstructorInjectedController;
import org.springframework.sfdi.controllers.MyController;
import org.springframework.sfdi.controllers.PropertyInjectedController;
import org.springframework.sfdi.controllers.SetterInjectedController;

@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);
		
		//name based. Naming convention is camel case with first letter as small case.
		MyController myController = (MyController) ctx.getBean("myController");
		String greeting = myController.sayHello();
		System.out.println(greeting);
		
		//type based
		MyController myController2 = ctx.getBean(MyController.class);
		greeting = myController2.sayHello();
		System.out.println(greeting);
		
		System.out.println("---------------Property");
		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());
		
		System.out.println("---------------Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());
		
		System.out.println("---------------Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
		
	}

}
