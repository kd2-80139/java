package com.company;
import java.util.*;
public class salaried extends employee {
	double salary;
	@Override
	public void accept() {
		System.out.println("Enter name: ");
		this.name=new Scanner(System.in).nextLine();

		System.out.println("Enter SSN: ");
		this.ssn=new Scanner(System.in).nextInt();
		
		System.out.println("Enter salary: ");
		this.salary=new Scanner(System.in).nextDouble();


	}

	@Override
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("SSN: "+this.ssn);
		System.out.println("Salary: "+this.salary);

	}

	@Override
	public double pay() {

		return 0.0;
	}

	@Override
	public String toString() {
		return "salaried [, name=" + name + ", ssn=" + ssn +"salary=" + salary +"]";
	}


	
}
