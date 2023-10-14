package Question2;
import java.util.*;
public class point2D {
	int x;
	int y;

	public point2D() {
		this.x = 0;
		this.y = 0;
	}

	public point2D(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public String getDetail() {
		return ("(" + x + "," + y + ")");
	}

	public boolean isEqual(point2D p2) {
		if (this.x == p2.getX() && this.y == p2.getY()) {
			return true;
		}
		return false;
	}
	public double calDistance(point2D p2) {
		return Math.sqrt(Math.pow(this.x-p2.getX(), 2)+Math.pow(this.y-p2.getY(), 2));
	}
	public void accept()
{
		System.out.println("Enter point x and y");
		int x=new Scanner(System.in).nextInt();
		this.setX(x);
		x=new Scanner(System.in).nextInt();
		this.setY(x);
	}

}

