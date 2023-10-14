package com.company;

import java.util.Scanner;

public class baseEmp extends employee {
	double grossSales;
	double comm;
	double basesal;
	
	@Override
	public void accept() {
		System.out.println("Enter name: ");
		this.name=new Scanner(System.in).nextLine();

		System.out.println("Enter SSN: ");
		this.ssn=new Scanner(System.in).nextInt();
		

		System.out.println("Enter Basic Pay: ");
		this.basesal=new Scanner(System.in).nextDouble();
		
		System.out.println("Enter Hourly Wages: ");
		this.grossSales=new Scanner(System.in).nextDouble();
		
		System.out.println("Enter Hours: ");
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
		return (comm*grossSales)+basesal;
	}

	@Override
	public String toString() {
		return "baseEmp [grossSales=" + grossSales + ", comm=" + comm + ", basesal=" + basesal + ", name=" + name
				+ ", ssn=" + ssn + ", pay()=" + pay() + "]";
	}


}
