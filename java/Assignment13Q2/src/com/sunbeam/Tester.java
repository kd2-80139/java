/**
 * 
 */
package com.sunbeam;

import java.util.*;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
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
		List<BookObjFile> BookObjFileList = new ArrayList<BookObjFile>();
		int index = 0;
		BookObjFile b, key;
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while (choice != 0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new BookObjFile in list");
			System.out.println("2. Display all BookObjFiles in forward order");
			System.out.println("3. Search a BookObjFile with given isbn");
			System.out.println("4. Delete a BookObjFile at given index`");
			System.out.println("5. Delete a BookObjFile with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("7. Add list to file");
			System.out.println("8. Read list From file");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new BookObjFile();
				b.acceptBook();
	
				if (BookObjFileList.contains(b)) {
				
					int x = BookObjFileList.indexOf(b);
					int q = BookObjFileList.get(x).getQty() + b.getQty();
					BookObjFileList.get(x).setQty(q);
				}

				else {
					BookObjFileList.add(b);
				}
				break;
			case 2:
				for(int i=0;i<BookObjFileList.size();i++) {
					System.out.println(BookObjFileList.get(i));
				}
				break;
			case 3:
				System.out.println("Enter isbn for searching = ");
				String isbn = sc.next();
				key = new BookObjFile();
				key.setIsbn(isbn);
				int ind = BookObjFileList.indexOf(key);
				if (ind == -1) {
					System.out.println("Not Found");

				} else
					System.out.println(BookObjFileList.get(ind));
				break;

			case 4:
				System.out.println("Enter index for deletion of BookObjFile = ");
				index = sc.nextInt();
				if (index < 0 && index > BookObjFileList.size()) {
					System.out.println("Wrong Index...:(");
		
				} else {
					BookObjFileList.remove(index);
					System.out.println("BookObjFile at given index deleted");
				}
				break;

			case 5:
				System.out.println("Enter isbn to Delete = ");
				isbn = sc.next();
				key = new BookObjFile();
				key.setIsbn(isbn);
				ind = BookObjFileList.indexOf(key);
				if (ind == -1) {
					System.out.println("NOT FOUND");
				} else {
					BookObjFileList.remove(ind);
				}

				break;

			case 6:

				Collections.reverse(BookObjFileList);
				for (BookObjFile BookObjFile : BookObjFileList) {
					System.out.println(BookObjFile);
				}
				break;
				
			case 7:
			{
				System.out.println("Adding books to File............");
				try(FileOutputStream fout=new FileOutputStream("Store.txt")) {
					try(ObjectOutputStream dout=new ObjectOutputStream(fout)){
						//for(BookObjFile b1:BookObjFileList) {
							dout.writeObject(BookObjFileList);
						//}
						
					}
		
					System.out.println("Books Added in File............");
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
					
				break;
			}
			case 8:{
				try(FileInputStream fin=new FileInputStream("Store.txt")){
					try(ObjectInputStream din=new ObjectInputStream(fin)){
						List<BookObjFile> list;
						//while(true) {
							list=(List<BookObjFile>)din.readObject();
							list.forEach(x->System.out.println(x));
						//}
//						for (BookObjFile bookObjFile : list) {
//							
//						}
					}
							
					
				}
//				catch (EOFException e) {
//					// TODO: handle exception
//				}
				catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
				
			break;
			default:
				System.out.println("Wrong Choice Entered :(");
				break;
			}
		}
		System.out.println("Thank you for using our BookObjFile App :)");

	}

}

