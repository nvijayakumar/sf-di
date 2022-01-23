/**
 * 
 */
package org.springframework.sfdi.services;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author vijayakumar
 * @Since  22-Jan-2022
 *
 */
@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {

	public LifeCycleDemoBean() {
		System.out.println("## I am in LifeCycleBean constructor.");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("## In LifeCycleBean InitializingBean#afterPropertiesSet() called.");
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("## In LifeCycleBean DisposableBean#destroy() called.");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println("## In LifeCycleBean @PostConstruct annotated method called.");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## In LifeCycleBean @PreDestroy annotated method called.");
	}

	@Override
	public void setBeanName(String name) {
		System.out.println("## In LifeCycleBean BeanNameAware#setBeanName() called with name: "+name);
	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		System.out.println("## In LifeCycleBean BeanFactoryAware#setBeanFactory() called.");
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		System.out.println("## In LifeCycleBean ApplicationContextAware#setApplicationContext() called.");
	}
	
	public void beforeInit() {
		System.out.println("## In LifeCycleBean beforeInit() called by bean post processor.");
	}
	
	public void afterInit() {
		System.out.println("## In LifeCycleBean afterInit() called by bean post processor.");
	}

}
