package model;

import java.util.ArrayList;

import model.domain.Customer;
import model.domain.GoldMember;
import model.domain.SilverMember;

public class Model {
	private static ArrayList<Customer> customer = new ArrayList<Customer>();
	
	public static int loginCounter;

	public static boolean createCustomer(String name, int money) {	
		if(name == null || money < 0) {
			return false;
		}else {
			if(money < 500) {
				Customer c = new Customer(name, money);
				customer.add(c);
			}else {
				Customer c = new Customer(name, money);
				customer.add(c);
			}
			
			return true;
		}	
	}
	
	public static ArrayList<Customer> getAllCustomer(){
		return customer;
	}
	
	public static Customer getCustomer(String name) {
		for(Customer v : customer) {
			if(v.getName() == name) {
				return v;
			}
		}
		return null;
	}
	
	
	
	

}
