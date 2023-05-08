package view;

import java.util.Scanner;

import controller.Controller;
import model.dto.CustomerDTO;

public class InputView {

	public static void main(String[] args) {

		String cust_id;
		String name;
		String cust_phone;
		String cust_birth;
		String gender;
		int amount = 0;
		int grade_id = 10;

		Scanner sc = new Scanner(System.in);

		System.out.println("회원 아이디");
		cust_id = sc.next();
		System.out.println("이름");
		name = sc.next();
		System.out.println("전화번호");
		cust_phone = sc.next();
		System.out.println("생년월일");
		cust_birth = sc.next();
		System.out.println("성별");
		gender = sc.next();

		System.out.println("회원정보를 출력합니다.");
		System.out.println(cust_id + " " + name + " " + cust_phone + " " + cust_birth + " " + gender + " " + amount
				+ " " + grade_id);

		Controller.addCustomer(new CustomerDTO(cust_id, name, cust_phone, cust_birth, gender, amount, grade_id));
	}

}
