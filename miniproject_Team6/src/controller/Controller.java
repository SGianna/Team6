package controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.sql.SQLException;

import model.CommandController;
import model.dto.CommandDto;
import view.InputView;
import model.SignInDAO;
import model.dto.CustomerDTO;
import view.OutputView;
import model.MenuDAO;
import view.OutputView;

public class Controller {

	private final Map<CommandController, Runnable> service = new HashMap<>();
	private final InputView inputView = new InputView();
	private final OutputView outputView = new OutputView();

	public Controller() {
		service.put(CommandController.FIRST, this::firstView); // 1번 선택
		service.put(CommandController.SECOND, this::secondView);// 2번 선택
		service.put(CommandController.THIRD, this::thridView);// 3번 선택
	}

	// 회원가입시 회원 정보 저장하기
	public static boolean addCustomer(ArrayList<String> info) {
		boolean result = false;
		try {
			result = SignInDAO.createCustomer(info);
			OutputView.createUser();
		} catch (SQLException s) {
			s.printStackTrace();
			OutputView.printException("모든 프로젝트 저장시 에러 발생");
		}
		return result;
	}

//	public void run() {
//		CommandController commandController = readCommand();
//		while (commandController.isNotQuit()) {
//			do {
//				try {
//					service.get(commandController).run();
//				} catch (IllegalArgumentException e) {
//					outputView.printException(e.getMessage());
//				} finally {
//					commandController = readCommand();
//				}
//
//			}while (!commandController.isNotQuit());
//		}
//	}
	public void run() {
		CommandController commandController = readCommand();
		while (commandController.isNotQuit()) {
			try {
				service.get(commandController).run();
			} catch (IllegalArgumentException e) {
				outputView.printException(e.getMessage());
			} finally {
				//commandController = readCommand();
			}
// 종료메세지는 static 메소드로 출력
		}
	}

	public CommandController readCommand() {
		CommandDto commandDto = Retry.execute(inputView::readCmd);
		return CommandController.from(commandDto.getCommand());
	}

	public void firstView() {
		inputView.firstMsg();
	}

	public void secondView() {
		//메뉴판 불러오기
		String menuName = inputView.secondMsg();
		//주문 메뉴의 가격 정보 가져오기
		Controller.setOrder(menuName);
	}

	public void thridView() {
		CustomerDTO cd = new CustomerDTO();
		ArrayList<String> info = infomSplit(inputView.thirdMsg());
		Controller.addCustomer(info);
	}
	
	public ArrayList<String> infomSplit(String msg){
		String [] information = msg.split(",");
		ArrayList<String> infomList = new ArrayList<>(Arrays.asList(information));
		
		return infomList;
	}

	public static boolean getAllMenu() {
		try {

			 OutputView.getMenuListView(MenuDAO.getAllMenu());

		} catch (SQLException s) {
			s.printStackTrace();
			OutputView.printException("메뉴판 생성에 실패하였습니다.");
			return false;
		}
		return true;
	}

	public static boolean setOrder(String menuName) {
	
		try {
			OutputView.OrderView(MenuDAO.getPrice(menuName));
		} catch (SQLException e) {
			e.printStackTrace();
			OutputView.printException(menuName + "의 가격 정보를 불러오지 못했습니다.");
			return false;
		}
		return true;
	}

}
