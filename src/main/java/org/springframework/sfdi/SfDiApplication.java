package org.springframework.sfdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.sfdi.config.SfConfiguration;
import org.springframework.sfdi.controllers.ConstructorInjectedController;
import org.springframework.sfdi.controllers.I18nController;
import org.springframework.sfdi.controllers.MyController;
import org.springframework.sfdi.controllers.PetController;
import org.springframework.sfdi.controllers.PropertyInjectedController;
import org.springframework.sfdi.controllers.SetterInjectedController;
import org.springframework.sfdi.datasource.FakeDataSource;
import org.springframework.sfdi.services.PrototypeBean;
import org.springframework.sfdi.services.SingletonBean;

//@ComponentScan(basePackages = {"org.springframework.pets", "org.springframework.sfdi"}) // removed due to java based DI added
@SpringBootApplication
public class SfDiApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SfDiApplication.class, args);
		
		PetController petController = ctx.getBean("petController", PetController.class);
		System.out.println(petController.whichPetIsTheBest());
		
		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayHello());
		
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
		
		System.out.println("----------Bean Scope----------");
		SingletonBean singletonBean1 = ctx.getBean(SingletonBean.class);
		singletonBean1.getMyScope();
		SingletonBean singletonBean2 = ctx.getBean(SingletonBean.class);
		singletonBean2.getMyScope();
		
		PrototypeBean prototypeBean1 = ctx.getBean(PrototypeBean.class);
		prototypeBean1.getMyScope();
		PrototypeBean prototypeBean2 = ctx.getBean(PrototypeBean.class);
		prototypeBean2.getMyScope();
		
		System.out.println("------------Fake Data Source");
		FakeDataSource fakeDataSource = ctx.getBean(FakeDataSource.class);
		System.out.println(fakeDataSource);
		
		System.out.println("------------Config Property Bean");
		SfConfiguration sfConfiguration = ctx.getBean(SfConfiguration.class);
		System.out.println(sfConfiguration);
	}

}
