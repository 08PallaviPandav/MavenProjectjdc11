package com.OOPS;
class Parent{
	public static void m1() {
		System.out.println("Parent class method");
	}
}
class Child extends Parent{
	public static void m2() {
		System.out.println("Child class method");
	}
}
public class OOPSPractice {

	public static void main(String[] args) {
		//Child c= new Child();
		Child.m2();
Child.m1();
	}

}
