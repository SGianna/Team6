package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CustomerDTO {
	private String cust_id;
	private String cust_name;
	private String cust_phone;
	private String cust_birth;
	private String gender;
	private int amount;
	private int grade_id;
}
