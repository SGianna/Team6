package model.domain;

public class SilverMember extends Customer {
	
	public SilverMember(String name, int money){
		super(name,money);
	}
	public String bene() {
		return "실버 멤버쉽입니다.";
	}
}
