import java.util.*;
public class A1Q5 {

	public static void main(String[] args) {
		int x;
		
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int n=1;
		int a=x;
		
		for(int i=0;i<x;i++) {
				a--;
			for(int j=0;j<a;j++) {
				System.out.print(" ");
			}
			int z=n;
			while(z>0) {
				System.out.print("*");
				z--;
			}
			n=n+2;
			System.out.println("");
		}

	}

}
