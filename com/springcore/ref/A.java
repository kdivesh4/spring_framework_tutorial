package com.springcore.ref;

public class A {
	
	private String x;
	private B obj;
	
	public String getX() {
		return x;
	}
	public void setX(String x) {
		this.x = x;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", obj=" + obj + "]";
	}
	
	
}
