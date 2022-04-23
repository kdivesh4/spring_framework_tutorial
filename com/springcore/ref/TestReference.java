package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context3 = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A temp=(A) context3.getBean("aref");
		B temp2 = (B) context3.getBean("bref");
		
		System.out.println(temp);
		System.out.println(temp.getObj());
		System.out.println(temp.getObj().getClass());
		System.out.println(temp.getObj().getY());
		System.out.println(temp2);
		System.out.println(temp2.getY());
	}

}
