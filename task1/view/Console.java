package view;

import model.Beeing;
import model.Child;
import model.Elf;
import model.Santa;

import java.util.Scanner;


public class Console {
	/*
	 * the console dialog comes here
	 */
	/*
	 * the console dialog comes here
	 */
	Scanner sc=new Scanner(System.in);
	public void dialog() {

		System.out.println("Please login:");
		System.out.println("Enter a name");
		//String name=sc.next();
		System.out.println("Enter an adress");
		//String adress=sc.next();


	}
	public void createBeeing() {
		System.out.println("Enter 1 for Elf,2 for Santa and 3 for child");
		int number = sc.nextInt();

		switch (number) {
			case 1:
				Elf elf = new Elf();
				break;

			case 2:
				Santa santa = new Santa();
				break;
			case 3:
				Child child = new Child();
				break;


		}



	}
	public void createChildDialog(){
		System.out.println("Enter a name and then enter");
		//String name=sc.next();
		System.out.println("Enter an adress and then enter");
		//String adress=sc.next();

	}
}
