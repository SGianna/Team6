package view;

import java.util.ArrayList;

import model.dto.MenuDTO;

public class OutputView {
	private static final String EXCEPTION_MESSAGE = "[ERROR] ";

	public static void getMenuListView(ArrayList<MenuDTO> menuList) {
		int listSize = menuList.size();

		if (listSize != 0) {
			int count = 1;

			System.out.println(" < 메뉴판 >");
			System.out.println("----------------------------------");
			for (MenuDTO m : menuList) {
				System.out.println(" " + m.getMenu_name() + " " + m.getPrice() + "원 " + m.getCalorie() + "cal");

			}
			System.out.println("----------------------------------");
		} else {
			System.out.println("검색 정보 0");
		}
	}

	public static void OrderView(int menuPrice) {
		System.out.println("주문해주셔서 감사합니다. 주문 금액은 " + menuPrice + "원 입니다.");
	}

	public static void userGradeView(String userName, String grade) {
		System.out.println(userName + " 님의 등급은 " + grade + " 입니다.");
	}

	public static void print(String s) {
		System.out.println(s);
	}

	public static void printException(String message) {
		System.out.println(EXCEPTION_MESSAGE + message);
	}

}
