package com.company;

import java.util.Scanner;

public class hourly extends employee {
	double wages;
	int hours;
	
	@Override
	public void accept() {
		System.out.println("Enter name: ");
		this.name=new Scanner(System.in).nextLine();

		System.out.println("Enter SSN: ");
		this.ssn=new Scanner(System.in).nextInt();
		
		System.out.println("Enter Hourly Wages: ");
		this.wages=new Scanner(System.in).nextDouble();
		
		System.out.println("Enter Hours: ");
		this.hours=new Scanner(System.in).nextInt();


	}

	@Override
	public void display() {
		System.out.println("Name: "+this.name);
		System.out.println("SSN: "+this.ssn);
		System.out.println("Salary: "+this.pay());

	}

	@Override
	public double pay() {
		if(hours<=40) {
		   return wages*hours;
		}
		return hours*wages+(hours-40)*wages*1.5;
	}

	@Override
	public String toString() {
		return "hourly [wages=" + wages + ", hours=" + hours + ", name=" + name + ", ssn=" + ssn +", Total pay="+pay() + "]";
	}

}
