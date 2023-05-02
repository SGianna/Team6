package view;

import controller.Controller;

public class StartView {

	public static void main(String[] args) {
		
		Controller.signin("clock", -10);
		Controller.signin("lion", 300);
		Controller.signin("cat", 600);
		Controller.signin("c", 600);
		//Controller.login("c", 600);
		
		Controller.showAllCustomer();
	}

}
