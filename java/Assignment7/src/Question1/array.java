package Question1;

public class array {
	public static String[] comp(String[] s1,String[] s2) {
		int size=s1.length;
		String[] res=new String[size];
		int i=0;
		for(String s: s1) {
			for(String ss:s2) {
				if(s.equals(ss)) {
					res[i]=s;
					i++;
				}
			}
		}
		
		return res;
	}
	
	
	public static void main(String[] args) {
		String[] s1= {"hello","it's","me","Ujjwal","Pratap","Singh"};
		String[] s2= {"hello","it's","me"};
		String[] res=comp(s1,s2);
		System.out.println("Repeated values are-");
		for(String s:res) {
			if(s==null) {
				break;
			}
			System.out.println(s);
		}

	}

}
