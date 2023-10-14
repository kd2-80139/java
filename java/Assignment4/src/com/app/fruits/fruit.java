package com.app.fruits;
import java.util.*;
public class fruit {
	String color ;
	double weight ; 
	String name; 
	boolean isFresh ;
	public fruit() {
		super();
		this.color ="";
		this.weight = 0;
		this.name ="";
		this.isFresh = true;
	}
	

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public boolean isFresh() {
		return isFresh;
	}


	public void setFresh(boolean isFresh) {
		this.isFresh = isFresh;
	}


	public fruit(String color, double weight, String name, boolean isFresh) {
		super();
		this.color = color;
		this.weight = weight;
		this.name = name;
		this.isFresh = isFresh;
	}

	@Override
	public String toString() {
		return "fruit [color=" + color + ", weight=" + weight + ", name=" + name + ", isFresh=" + isFresh + "]";
	}
	public String taste() {
		return "";
	}
	
}
class apple extends fruit{
	
	@Override
	public String taste() {
		return "sweet n sour";
	}

	public void accept() {
		setName("Apple");
		System.out.println("Enter Weight: ");
		Scanner sc=new Scanner(System.in);
		
		double w=sc.nextDouble();
		sc.nextLine();
		setWeight(w);
		System.out.println("Enter Color: ");
		String c =sc.nextLine();
		setColor(c);
		setFresh(true);
		
	}
	@Override
	public String toString() {
		return "apple [color=" + color + ", weight=" + weight +", taste"+ taste()+ ", fresh="+isFresh()+"]";
	}
	
	
}
class orange extends fruit{
	
	@Override
	public String taste() {
		return "sour";
	}
	public void accept() {
		setName("Orange");
		System.out.println("Enter Weight: ");
		Scanner sc=new Scanner(System.in);
		
		double w=sc.nextDouble();
		sc.nextLine();
		setWeight(w);
		System.out.println("Enter Color: ");
		String c =sc.nextLine();
		setColor(c);
		setFresh(true);
		
	}

	@Override
	public String toString() {
		return "ornage [color=" + color + ", weight=" + weight+", taste="+ taste()+", fresh="+isFresh()+"]" ;
	}
	
	
}
class mango extends fruit{
	
	@Override
	public String taste() {
		return "sweet";
	}
	public void accept() {
		setName("Mango");
		System.out.println("Enter Weight: ");
		Scanner sc=new Scanner(System.in);
		
		double w=sc.nextDouble();
		sc.nextLine();
		setWeight(w);
		System.out.println("Enter Color: ");
		String c =sc.nextLine();
		setColor(c);
		setFresh(true);
		
	}

	@Override
	public String toString() {
		return "mango [color=" + color + ", weight=" + weight +", taste="+ taste()+", fresh="+isFresh()+"]" ;
	}
	
	
}

