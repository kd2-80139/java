import java.util.*;
public class A1Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int x=sc.nextInt();
		System.out.println("GIVEN NUMBER: "+x);
		System.out.println("BINARY: "+Integer.toBinaryString(x));
		System.out.println("OCTAL: "+Integer.toOctalString(x));
		System.out.println("HEXADECIMAL: "+Integer.toHexString(x));
	}

}
