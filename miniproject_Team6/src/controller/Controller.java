package controller;

import java.util.HashMap;
import java.util.Map;
import java.sql.SQLException;

import model.CommandController;
import model.CustomerService;
import model.dto.CommandDto;
import view.InputView;
import model.SignInDAO;
import model.dto.CustomerDTO;
import view.OutputView;
import model.MenuDAO;
import view.OutputView;

public class Controller {

//	private final Map<CommandController, Runnable> service = new HashMap<>();
//	private CustomerService customerService;
//	private final InputView inputView = new InputView();
//	private final OutputView outputView = new OutputView();
//
//	public Controller() {
//		this.customerService = new CustomerService();
//		service.put(CommandController.FIRST, this::firstView); // 1번 선택
//		service.put(CommandController.SECOND, this::secondView);// 2번 선택
//		service.put(CommandController.THIRD, this::thridView);// 3번 선택
//	}

	// 회원가입시 회원 정보 저장하기
//	public static boolean addCustomer(CustomerDTO signin) {
//		boolean result = false;
//		try {
//			result = SignInDAO.createCustomer(signin);
//			OutputView.print("회원가입이 완료되었습니다.");
//		} catch (SQLException s) {
//			s.printStackTrace();
//			OutputView.printException("모든 프로젝트 저장시 에러 발생");
//		}
//		return result;
//	}

//	public void run() {
//		CommandController commandController = readCommand();
////        while(readCommand() != "Q") {
//		do {
//			try {
//				service.get(commandController).run();
//			} catch (IllegalArgumentException e) {
//				outputView.printException(e.getMessage());
//			} finally {
//				commandController = readCommand();
//			}
//
//		} while (commandController.isNotQuit());
////        }
//	}

//	public CommandController readCommand() {
//		CommandDto commandDto = Retry.execute(inputView::readCmd);
//		return CommandController.from(commandDto.getCommand());
//	}
//
//	public void firstView() {
//		inputView.firstMsg();
//	}
//
//	public void secondView() {
//		inputView.secondMsg();
//	}
//
//	public void thridView() {
//		inputView.thirdMsg();
//	}
//
//	public void quitView() {
//		inputView.quitMsg();
//
//	}

	public static void getAllMenu() {
		try {

			// OutputView.getMenuListView(MenuDAO.getAllMenu());

		} catch (SQLException s) {
			s.printStackTrace();
			OutputView.printException("메뉴판 생성에 실패하였습니다.");
		}
	}

	public static int getPrice(String menuName) {
		OutputView.OrderView(MenuDAO.getPrice(menuName));
	}

}
