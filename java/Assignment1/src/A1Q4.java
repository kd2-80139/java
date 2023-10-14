import java.util.*;
public class A1Q4 {

	public static void main(String[] args) {
		int x;
		Scanner sc=new Scanner(System.in);
		x=sc.nextInt();
		int n=x;
		for(int i=0;i<x;i++) {
			n--;
			for(int j=0;j<n;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<x-n;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
