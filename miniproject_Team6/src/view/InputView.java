package view;

import java.util.Scanner;

import controller.Controller;
import model.dto.CommandDTO;

public class InputView {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		Controller controller = new Controller();
		controller.run();
	}
	
	private static final String BRAND_MSG = 
			"\r\n"
			+ "______  _____  _____   ___    _____   ___  ______  _____ \r\n"
			+ "|  ___||_   _|/  ___| / _ \\  /  __ \\ / _ \\ |  ___||  ___|\r\n"
			+ "| |_     | |  \\ `--. / /_\\ \\ | /  \\// /_\\ \\| |_   | |__  \r\n"
			+ "|  _|    | |   `--. \\|  _  | | |    |  _  ||  _|  |  __| \r\n"
			+ "| |     _| |_ /\\__/ /| | | | | \\__/\\| | | || |    | |___ \r\n"
			+ "\\_|     \\___/ \\____/ \\_| |_/  \\____/\\_| |_/\\_|    \\____/ \r\n";
	
	private static final String WELCOME_MSG = "\n FISA 카페에 오신걸 환영합니다! :) \n"+ "\n 번호를 선택해주세요 \n" + "1. 회원주문\n" + "2. 비회원주문\n" + "3. 회원가입\n" + "Q. 종료\n";

	private static final String FIRST_MSG = "회원정보(이름, 전화번호)를 입력해주세요\n" + "예시) 고재민,010-4512-6065";
	private static final String SECOND_MSG = "주문하실 메뉴의 이름을 입력하세요.";

	private static final String THIRD_MSG = "회원가입 정보를 입력해주세요.\n" + "이름, 번호, 생년월일, 성별(M or F)\n"
			+ "예시) 차은영,010-9254-6456,2000-09-02,F";
	private static final String QUIT_MSG = "이용해주셔서 감사합니다. 안녕히 가세요.";

	public CommandDTO readCmd() {
		System.out.println(BRAND_MSG);
		System.out.println(WELCOME_MSG);
		String cmd = sc.next().toUpperCase();
		return new CommandDTO(cmd);
	}

	// 프론트 부분 - 각 화면에 대한 메시지 출력
	public String firstMsg() {
		System.out.println(FIRST_MSG);
		String msg = sc.next();
		return msg;
	}

	public String secondMsg() { 
		System.out.println(SECOND_MSG);
		// 메뉴판 불러오기
		Controller.getAllMenu();
		String msg = sc.next();
		return msg;
	}

	public String thirdMsg() { 
		System.out.println(THIRD_MSG);
		String msg = sc.next();
		return msg;
	}
	
	public void fourthMsg() {
		System.out.println(QUIT_MSG);
	}

}
