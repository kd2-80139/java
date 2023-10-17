package Question2;

public class rev {
	
	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		return res;
	}
	
	public static void main(String[] args) {
		System.out.println(rev(""));

	}

}
