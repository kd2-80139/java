
public class A2Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice s1;
		s1=new Invoice("123","cake",2,10);
		System.out.println(s1.getDescription()+"  "+s1.getNumber()+"  "+s1.getPrice()+"  "
		+s1.getQty()+"  "+s1.calculateamount());
		

	}

}
