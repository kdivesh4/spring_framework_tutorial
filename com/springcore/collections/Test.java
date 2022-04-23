package com.springcore.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	ApplicationContext context1 = new ClassPathXmlApplicationContext("com/springcore/collections/collectionsconfig.xml");
	
	Employee emp1 = (Employee)context1.getBean("emp1");
	Employee emp2 = (Employee)context1.getBean("emp2");
	
	System.out.println(emp1);
	System.out.println(emp2);
	}

}
