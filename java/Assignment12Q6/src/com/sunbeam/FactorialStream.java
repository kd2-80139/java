/**
 * 
 */
package com.sunbeam;

import java.util.stream.Stream;

/**
 * @author ujjwal
 *
 */
public class FactorialStream {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stream<Integer> strm = Stream.iterate(1, x -> ++x).limit(5);
		int res = strm.reduce(1, (a, b) -> a * b);
		System.out.println("Result: " + res);

	}

}
