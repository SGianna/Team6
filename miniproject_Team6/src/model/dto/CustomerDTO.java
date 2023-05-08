package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDTO extends People{
	private String cust_id;
	private String cust_birth;
	private String gender;
	private int amount;
	private int grade_id;
	
	public CustomerDTO(String name, String phone) {
		super(name,phone);
		cust_id = null;
		cust_birth = null;
		gender = null;
		amount = 0;
		grade_id = 0;
	}
}
