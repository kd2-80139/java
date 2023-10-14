package com.app.fruits;

import java.util.*;

public class tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int size;
		int top = -1;
		System.out.println("Enter size of your basket: ");
		size = new Scanner(System.in).nextInt();
		fruit[] basket = new fruit[size];
		int choice = 1;
		while (choice != 0) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Menu");
			System.out.println("0.Exit");
			System.out.println("1. Add Mango");
			System.out.println("2. Add Orange");
			System.out.println("3. Add Apple");
			System.out.println("4. Display names of all fruits in the basket");
			System.out.println("5. Display name,color,weight,taste of all fresh fuits in the basket");
			System.out.println("6. Display tastes of all stale fruits in the basket ");
			System.out.println("7. Mark a fruit as stale");
			System.out.println("8. Mark all sour fruits stale");
			System.out.print("Enter your choice: ");
			choice = new Scanner(System.in).nextInt();
			System.out.println("-----------------------------------------------------------------------");
			switch (choice) {
			case 0:
				System.out.println("Bye Bye");
				break;
			case 1: {
				if (top == size) {
					System.out.println("Bucket Is Full");
					break;
				}
				mango m = new mango();
				m.accept();
				basket[++top] = m;
			}
				break;
			case 2: {
				if (top == size) {
					System.out.println("Bucket Is Full");
					break;
				}
				orange o = new orange();
				o.accept();
				basket[++top] = o;
			}
				break;
			case 3: {
				if (top == size) {
					System.out.println("Bucket Is Full");
					break;
				}
				apple a = new apple();
				a.accept();
				basket[++top] = a;
			}
				break;
			case 4: {
				if (top == -1) {
					System.out.println("Basket is empty");
					break;

				}
				for (int i = 0; i <= top; i++) {
					System.out.println(basket[i].getName());
				}

			}
				break;
			case 5: {
				if (top == -1) {
					System.out.println("Basket is empty");
					break;

				}
				for (int i = 0; i <= top; i++) {
					System.out.println(basket[i].toString());
				}

			}
				break;
			case 6:
				if (top == -1) {
					System.out.println("Basket is empty");
					break;

				}
				for (int i = 0; i <= top; i++) {
					if (!basket[i].isFresh())
						System.out.println(basket[i].toString());
				}
				break;
			case 7: {
				System.out.println("enter index ");
				int s = new Scanner(System.in).nextInt();
				if (s > top && s< 0) {
					System.out.println("Invalid index ");
					break;
				}
				basket[s].setFresh(false);
				break;
			}
			case 8:{
				if (top == -1) {
					System.out.println("Basket is empty");
					break;

				}
				for (int i = 0; i <= top; i++) {
					if (basket[i].taste()=="sour")
						basket[i].setFresh(false);
				}
			}
			default:System.out.println("Wrong choice....");
			}

		}
	}

}
