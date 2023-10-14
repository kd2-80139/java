package com.company;

import java.util.Scanner;

public class commission extends employee {
	double grossSales;
	double comm;
	
	@Override
	public void accept() {
		System.out.println("Enter name: ");
		this.name=new Scanner(System.in).nextLine();

		System.out.println("Enter SSN: ");
		this.ssn=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Gross Sales: ");
		this.grossSales=new Scanner(System.in).nextDouble();
		
		System.out.println("Enter Comm: ");
		this.comm=new Scanner(System.in).nextDouble();


	}

	@Override
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("SSN: "+this.ssn);
		System.out.println("Salary: "+this.pay());

	}

	@Override
	public double pay() {
		return comm*grossSales;
	}

	@Override
	public String toString() {
		return "commission [grossSales=" + grossSales + ", comm=" + comm + ", name=" + name + ", ssn=" + ssn
				+ ", pay()=" + pay() + "]";
	}
	


}
