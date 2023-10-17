package Question3;

public class palindrome {
	public static String rev(String s) {
		String res="";
		for(int i=s.length()-1;i>=0;i--) {
			res=res+s.charAt(i);
		}
		return res;
	}
	public static boolean palindrome(String s) {
		String res=rev(s);
		if(res.equals(s))
		return true;
		return false;
	}
	public static void main(String[] args) {
		System.out.println(palindrome("mom"));
	}
}
