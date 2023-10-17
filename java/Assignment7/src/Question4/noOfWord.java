package Question4;

public class noOfWord {
	public static int noOfWord(String s) {
		String[] res=s.split(" ",10000);
		return res.length;
	}
	public static void main(String[] args) {
		System.out.println(noOfWord("Hello my name is Ujjwal Pratap Singh How Are You"));

	}

}
