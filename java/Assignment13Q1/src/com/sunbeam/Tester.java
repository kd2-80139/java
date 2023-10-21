/**
 * 
 */
package com.sunbeam;

import java.util.*;
import java.io.DataInputStream;
import java.io.DataOutputStream;
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
		List<BookFile> BookFileList = new ArrayList<BookFile>();
		int index = 0;
		BookFile b, key;
		Scanner sc = new Scanner(System.in);
		int choice = 1;
		while (choice != 0) {
			System.out.println("------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("1. Add new BookFile in list");
			System.out.println("2. Display all BookFiles in forward order");
			System.out.println("3. Search a BookFile with given isbn");
			System.out.println("4. Delete a BookFile at given index`");
			System.out.println("5. Delete a BookFile with given isbn.");
			System.out.println("6. Reverse the list");
			System.out.println("7. Add list to file");
			System.out.println("8. Read list From file");
			System.out.print("Enter your choice = ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("------------------------------------------------------");
			switch (choice) {
			case 1:
				b = new BookFile();
				b.acceptBook();
	
				if (BookFileList.contains(b)) {
				
					int x = BookFileList.indexOf(b);
					int q = BookFileList.get(x).getQty() + b.getQty();
					BookFileList.get(x).setQty(q);
				}

				else {
					BookFileList.add(b);
				}
				break;
			case 2:
				for(int i=0;i<BookFileList.size();i++) {
					System.out.println(BookFileList.get(i));
				}
				break;
			case 3:
				System.out.println("Enter isbn for searching = ");
				String isbn = sc.next();
				key = new BookFile();
				key.setIsbn(isbn);
				int ind = BookFileList.indexOf(key);
				if (ind == -1) {
					System.out.println("Not Found");

				} else
					System.out.println(BookFileList.get(ind));
				break;

			case 4:
				System.out.println("Enter index for deletion of BookFile = ");
				index = sc.nextInt();
				if (index < 0 && index > BookFileList.size()) {
					System.out.println("Wrong Index...:(");
		
				} else {
					BookFileList.remove(index);
					System.out.println("BookFile at given index deleted");
				}
				break;

			case 5:
				System.out.println("Enter isbn to Delete = ");
				isbn = sc.next();
				key = new BookFile();
				key.setIsbn(isbn);
				ind = BookFileList.indexOf(key);
				if (ind == -1) {
					System.out.println("NOT FOUND");
				} else {
					BookFileList.remove(ind);
				}

				break;

			case 6:

				Collections.reverse(BookFileList);
				for (BookFile BookFile : BookFileList) {
					System.out.println(BookFile);
				}
				break;
				
			case 7:
			{
				System.out.println("Adding books to File............");
				try(FileOutputStream fout=new FileOutputStream("Store.txt")) {
					try(DataOutputStream dout=new DataOutputStream(fout)){
						for(BookFile b1:BookFileList) {
							dout.writeUTF(b1.getIsbn());
							dout.writeDouble(b1.getPrice());
							dout.writeUTF(b1.getAuthorName());
							dout.writeInt(b1.getQty());
						}
						
					}
					Thread.sleep(5000);
					System.out.println("Books Added in File............");
				}
				
				catch (Exception e) {
					e.printStackTrace();
				}
					
				break;
			}
			case 8:{
				try(FileInputStream fin=new FileInputStream("Store.txt")){
					try(DataInputStream din=new DataInputStream(fin)){
						while(true) {
							BookFile books=new BookFile();
							books.setIsbn(din.readUTF());
							books.setPrice(din.readDouble());
							books.setAuthorName(din.readUTF());
							books.setQty(din.readInt());
							System.out.println(books.toString()); 
						}
					}
							
					
				}
				catch (EOFException e) {
					// TODO: handle exception
				}
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
		System.out.println("Thank you for using our BookFile App :)");

	}

}

