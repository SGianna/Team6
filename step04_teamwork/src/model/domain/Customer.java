package model.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Customer {
	private String name;
	private int money;

	public String bene() {
		return "등급이 설정되지 않았습니다.";
	}
	
	public void setName(String name) {
		if(name.length() < 2) {
			this.name = "임시이름";
		}else {
			this.name = name;
		}
	}
	
	public String getName() {
		return name;
	}

	public Customer(String name, int money) {
		setName(name);
		this.money = money;
	}

}
