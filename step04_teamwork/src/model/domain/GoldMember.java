package model.domain;

public class GoldMember extends Customer {
	
	public GoldMember(String name, int money){
		super(name,money);
	}
	public String bene() {
		return "골드 멤버쉽입니다.";
	}
}
