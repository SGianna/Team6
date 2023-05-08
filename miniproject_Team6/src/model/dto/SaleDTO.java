package model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class SaleDTO {
		private int order_id;
		private String order_date;
		private int total;
		private String cust_id;
		
		public String toString() {
			
			return ("주문번호: "+ " "+ order_id + "주문일시: "+" "+ order_date+ "총금액: "+ " "+total + 
					"고객번호: "+ " " + cust_id);
					
		}
		
}
