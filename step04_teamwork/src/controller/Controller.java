package controller;

import model.Model;
import model.domain.Customer;
import view.EndView;

public class Controller {
	public static void signin(String name, int money) {
		
		if(Model.createCustomer(name, money)) {
			EndView.signinSuccess();
			
		}else {
			EndView.signinFailed();
		}
	}
	
	public static void login(String name, int money) {
		String message = Model.getCustomer(name).getName() + "님이 접속하셨습니다.";
		
	}
	
	public static void showAllCustomer() {
		for(Customer v : Model.getAllCustomer()) {
			EndView.showPrint(v.getName() + "님의 잔액은" + v.getMoney() + "이고 " + v.bene());
		}
	}
}
