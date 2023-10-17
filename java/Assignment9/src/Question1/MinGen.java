/**
 * 
 */
package Question1;
import java.lang.*;
/**
 * @author ujjwal
 *
 */
public class MinGen {

	/**
	 * @param args
	 */
	static <T extends Number> T findMin(T[] arr) {
		T res=arr[0];
		for(T x: arr) {
			if(res.doubleValue()>x.doubleValue()) {
				res=x;
			}
		}
			return res;
		}
	public static void main(String[] args) {
		Integer[] arr1 = { 22, 55, 77, 11, 33 };
		Integer min1 = findMin(arr1);
		Double[] arr2 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		Double min2 = findMin(arr2);
		System.out.println(min1+"   "+min2);

	}

}
