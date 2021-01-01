package application;

import controller.Controller;
import view.Console;

public class Main {
	public static void main(String[] args) {
		Controller controller=new Controller();
		//new Console().dialog();
		controller.registerChild();
		controller.printArray();
	}
}
