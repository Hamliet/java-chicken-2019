package view;

import java.util.List;
import java.util.Scanner;

import domain.Menu;
import domain.Table;
import util.ExceptionHandler;


public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

	public static int inputSelectWork() {
		System.out.println("## ����ȭ��");
		System.out.println("1 - �ֹ����");
		System.out.println("2 - �����ϱ�");
		System.out.println("3 - ���α׷� ����");
		return ExceptionHandler.inputSelectWorkHandler();
	}

	public static int inputSelectTable(List<Table> tables) {
        System.out.println("## �ֹ��� ���̺��� �����ϼ���.");
		return ExceptionHandler.inputSelectTableHandler(tables);
	}


	public static int inputSelectMenu(List<Menu> menus) {
        System.out.println("## ����� �޴��� �����ϼ���.");
		return ExceptionHandler.inputSelectMenuHandler(menus);
	}

	public static int inputSelectMenuCount(Table table) {
        System.out.println("## �޴��� ������ �Է��ϼ���.");
		return ExceptionHandler.inputSelectMenuCountHandler(table);
	}

}
