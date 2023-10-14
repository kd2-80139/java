package com.company;

public class tester {

	public static void main(String[] args) {
		employee emp1=new salaried();
		emp1.accept();
		emp1.display();
		System.out.println(emp1.toString());
		employee emp2=new hourly();
		emp2.accept();
		emp2.display();
		System.out.println(emp2.toString());
		employee emp3=new commission();
		emp3.accept();
		emp3.display();
		System.out.println(emp3.toString());
		employee emp4=new baseEmp();
		emp4.accept();
		emp4.display();
		System.out.println(emp4.toString());

	}

}
