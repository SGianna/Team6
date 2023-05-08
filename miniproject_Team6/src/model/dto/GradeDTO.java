package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class GradeDTO {
	private int grade_id;
	private String grade_name;
	private int standard;
	
	public String toString() {
		
		return("등급번호: " + " "+ grade_id+ "등급이름: "+ " "+ grade_name+ 
				"기준: "+" " +standard );
		
		
		
	
			
	}
	
}	
