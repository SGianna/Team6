package view;

public class OutputView {

//	public static void getMenuListView(ArrayList<MenuDTO> menuList) {
//		int listSize = menuList.size();
//		
//		if(listSize != 0) {
//			int count = 1;
//			
//			for(MenuDTO m : menuList) {
//				System.out.println("메뉴판");
//			}
//		}else {
//			System.out.println("검색 정보 0");
//		}
//	}

	//예외 상황 출력
	public static void showError(String message){
		System.out.println(message);		
	}
}
