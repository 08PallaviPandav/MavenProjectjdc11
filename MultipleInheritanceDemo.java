package com.OOPS;

	interface X {
		
		public  void m1();
			}
		interface Y {
			public abstract  void m2() ;

		}
		class Z implements X,Y{
			public static void m3 () {
				System.out.println("Class c method");
			}

			@Override
			public  void m2() {
	
			System.out.println("M2 mehod");	
			}

			@Override
			public void m1() {
				System.out.println("m1 method");
				
			}
		}

public class MultipleInheritanceDemo {

	public static void main(String[] args) {
		Z.m3();
		Z z= new Z();
		z.m1();
		z.m2();

	}

}
