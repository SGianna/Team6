package view;

public class EndView {
	public static void signinSuccess() {
		System.out.println("회원가입에 성공하였습니다.");
	}
	
	public static void signinFailed() {
		System.out.println("회원가입에 실패하였습니다.");
	}
	
	public static void showPrint(String message) {
		System.out.println(message);
	}
}
