/**
 * 
 */
package com.sunbeam;
import java.util.*;
/**
 * @author ujjwal
 *
 */


public class Book implements Comparable<Book> {
	String isbn;
	double price;
	String authorName;
	int qty;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", price=" + price + ", authorName=" + authorName + ", qty=" + qty + "]";
	}
	public void acceptBook() {
		System.out.println("Enter isbn: ");
		setIsbn(new Scanner(System.in).next());
		System.out.println("Enter Author: ");
		setAuthorName(new Scanner(System.in).next());
		System.out.println("Enter Price: ");
		setPrice(new Scanner(System.in).nextDouble());
		System.out.println("Enter qty: ");
		setQty(new Scanner(System.in).nextInt());
		
	}
	@Override
	public int compareTo(Book arg0) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
}
