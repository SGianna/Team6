package view;

import java.util.Scanner;

import controller.Controller;
//import model.dto.CustomerDTO;

public class InputView {

	public static void main(String[] args) {

//		static Scanner sc = new Scanner(System.in);
//
		public static void main(String[] args) {
			Controller controller = new Controller();
			controller.run();
//		    if(sc.equals('Q')) {
//		    	break;
//		    }
		    
		}
//		private static final String WELCOME_MSG = "\n 번호를 선택해주세요 \n"
//	            + "1. 회원주문\n"
//	            + "2. 비회원주문\n"
//	            + "3. 회원가입\n"
//	            + "Q. 종료\n";
//	    
//	    private static final String FIRST_MSG = "회원정보(이름, 전화번호)를 입력해주세요\n"
//	    		+ "예시) 고재민, 010-4512-6065";
//	    private static final String SECOND_MSG = "주문하실 메뉴를 골라주세요.";
//	    
//	    private static final String THIRD_MSG = "회원가입 정보를 입력해주세요.\n"
//	    		+ "이름, 번호, 생년월일, 성별(M or F)\n"
//	    		+ "예시) 고재민, 010-4512-6065, 980731, M";
//	    private static final String QUIT_MSG = "이용해주셔서 감사합니다. 안녕히 가세요.";
//	    
//	    public CommandDto readCmd(){
//	        System.out.println(WELCOME_MSG);
//	        String cmd = sc.next().toUpperCase();
//	        return new CommandDto(cmd);
//	    }
//	    public String firstMsg(){
//	        System.out.println(FIRST_MSG);
//	        String msg = sc.next();
//	        return msg;
//	    }
//	    public String secondMsg(){
//	        System.out.println(SECOND_MSG);
//	        System.out.println(WELCOME_MSG);
//	        String msg = sc.next();
//	        return msg;
//	    }
//	    public String thirdMsg(){
//	        System.out.println(THIRD_MSG);
//	        String msg = sc.next();
//	        return msg;
//	    }
//	    public String quitMsg() {
//	    	System.out.println(QUIT_MSG);
//	    	String msg = sc.next();
//	    	return msg;
//	    }
	    
//은영 테스트 코드		
//		String cust_id;
//		String name;
//		String cust_phone;
//		String cust_birth;
//		String gender;
//		int amount = 0;
//		int grade_id = 10;
//
//		Scanner sc = new Scanner(System.in);
//
//		System.out.println("회원 아이디");
//		cust_id = sc.next();
//		System.out.println("이름");
//		name = sc.next();
//		System.out.println("전화번호");
//		cust_phone = sc.next();
//		System.out.println("생년월일");
//		cust_birth = sc.next();
//		System.out.println("성별");
//		gender = sc.next();
//
//		System.out.println("회원정보를 출력합니다.");
//		System.out.println(cust_id + " " + name + " " + cust_phone + " " + cust_birth + " " + gender + " " + amount
//				+ " " + grade_id);
//
//		Controller.addCustomer(new CustomerDTO(cust_id, name, cust_phone, cust_birth, gender, amount, grade_id));
//	
	}

}
