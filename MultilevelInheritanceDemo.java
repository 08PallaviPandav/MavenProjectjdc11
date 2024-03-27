package com.OOPS;
class A {
	
public static void m1() {
	System.out.println("class A method");
}
	}
class B extends A {
	public static void m2() {
		System.out.println("class B method");
	}
}
class C extends B{
	public static void m3 () {
		System.out.println("Class c method");
	}
}
public class MultilevelInheritanceDemo {
	
	

	

	public static void main(String[] args) {
		C.m3();
C.m2();
C.m1();
	}

}
