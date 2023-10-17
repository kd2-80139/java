/**
 * 
 */
package com.sunbeam;
import java.util.*;
/**
 * @author ujjwal
 *
 */
public class Tester {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Book> bookList=new ArrayList<Book>();
		int index=0;
		Book b,key;
		Scanner sc= new Scanner(System.in);
			int choice=1;
			while(choice!=0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new book in list");
			System.out.println("2. Display all books in forward order");
			System.out.println("3. Delete at book given index");
			System.out.println("4. Check if book with given isbn is in list or not");
			System.out.println("5. Delete all books in list");
			System.out.println("6. Display number of books in list");
			System.out.println("7. Sort all books by price in desc order");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new Book();
				b.acceptBook();
				bookList.add(b);
				break;
			case 2:
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
			case 3:
				System.out.println("Enter index for deletion of book = ");
				index = sc.nextInt();
				if (index < 0 && index > bookList.size()) {
					System.out.println("Wrong Index...:(");
					break;
				} else {
					bookList.remove(index);
					System.out.println("Book at given index deleted");
					break;
				}

			case 4:
				System.out.println("Enter isbn for searching = ");
				String isbn = sc.next();
				key = new Book();
				key.setIsbn(isbn);
				System.out.println(bookList.contains(key));
				break;
				
			case 5:
				bookList.clear();
				System.out.println("All books in list are deleted.");
				break;
				
			case 6:

				System.out.println("Number of books in list = " + bookList.size());
				break;
				
			case 7:
				
				class Arrsort implements Comparator<Book> {
					@Override
					public int compare(Book a, Book b) {
						int diff = -Double.compare(a.getPrice(), b.getPrice());

						return diff;
					}
				}
				Arrsort booksort = new Arrsort();
				bookList.sort(booksort);
				System.out.println("Sorted Book List");
				for (Book book : bookList) {
					System.out.println(book);
				}
				break;
				
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our Book App :)");
				
			}
	
	}



