import java.util.*;
public class A1Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
		 double x=sc.nextDouble();
		 double y=sc.nextDouble();
		 if(x%1==0 && y%1==0) {
			 System.out.println("Errorrrrrrrr:: Enter only double values");
			 return;
		 }
		 System.out.println("AVERAGE: "+(x+y)/2);
	}

}
