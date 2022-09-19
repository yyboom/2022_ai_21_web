package com.multi.test;

public class A {
	B b;
	public A(){
		b =new B();
	}
	public void register() {
		b.insert();
	}
}
