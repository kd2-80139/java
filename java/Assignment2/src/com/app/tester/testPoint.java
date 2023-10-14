
package com.app.tester;
import com.app.geometry.*;
import java.util.*;

public class testPoint {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1st point");
		int x=sc.nextInt();
		
		int y=sc.nextInt();
		point2D p1;
		p1=new point2D(x,y);
		System.out.println("Enter 2st point");
		 x=sc.nextInt();
		
		 y=sc.nextInt();
		point2D p2;
		p2=new point2D(x,y);
		
		System.out.println("Distance "+p1.calDistance(p2));

	}

}
