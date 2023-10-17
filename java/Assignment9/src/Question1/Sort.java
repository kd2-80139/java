/**
 * 
 */
package Question1;

import java.util.*;

/**
 * @author ujjwal
 *
 */

class Arrsort implements Comparator<Double> {
	@Override
	public int compare(Double a, Double b) {
		if (a.doubleValue() == b.doubleValue())
			return 0;
		if (a.doubleValue() > b.doubleValue())
			return 1;

		return -1;
	}
}
public class Sort {

	/**
	 * @param args
	 */
	

	static <T> void selectionSort(T[] arr, Comparator<T> c)  {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		for(T ele:arr) {
			System.out.print(ele+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double[] d1 = { 2.2, 5.5, 7.7, 1.1, 3.3 };
		selectionSort(d1,new Arrsort());
	}

}
