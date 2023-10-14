package Question1;
public class ExceptionLineTooLong {
	private String s;

	public String getS() {
		return s;
	}

	public void setS(String s) {
		if(s.length()>80) {
			throw new RuntimeException("The strings is too long");
		}
		this.s = s;
	}

	@Override
	public String toString() {
		return "ExceptionLineTooLong [s=" + s + "]";
	}
	
}
