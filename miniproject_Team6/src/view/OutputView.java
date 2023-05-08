package view;

import java.util.ArrayList;

import model.dto.MenuDTO;

public class OutputView {
    private static final String EXCEPTION_MESSAGE = "[ERROR] ";

    public static void printException(String message) {
        System.out.println(EXCEPTION_MESSAGE + message);
    }
	public static void getMenuListView(ArrayList<MenuDTO> menuList) {
		int listSize = menuList.size();
		
		if(listSize != 0) {
			int count = 1;
			
			System.out.println(" < 메뉴판 >");
			System.out.println("----------------------------------");
			for(MenuDTO m : menuList) {
				System.out.println(count++ +"." + 
									m.getMenu_name() + " " 
									+m.getPrice() + "원 "
									+m.getCalorie() + "cal");
			
			}
			System.out.println("----------------------------------");
		}else {
			System.out.println("검색 정보 0");
		}
	}

}
