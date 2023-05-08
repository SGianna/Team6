package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@Getter
@AllArgsConstructor
@Setter
public class MenuDTO {
	private int menu_id;
	private String menu_name;
	private int price;
	private int categories;
	private int calorie;
	
	public String toString() {
		
		return ("메뉴번호: "+ "  "+ menu_id+ "메뉴이름: "+ " "+ menu_name+ 
				"가격: "+" "+price +"카테고리: "+ " "+ categories + "칼로리: "+" "+
				calorie);
	}
	
	
}
