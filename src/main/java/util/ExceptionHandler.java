package util;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import domain.Table;

public class ExceptionHandler {
	private static final int ORDER = 1;
	private static final int PAYMENT = 2;
	private static final int EXIT = 3;
	private static Scanner scanner = new Scanner(System.in);

	public static int inputSelectWorkHandler() {
		try {
			return checkInputSelectWorkHandler(scanner.nextInt());
		} catch (InputMismatchException | IllegalArgumentException e) {
			System.out.println("�Է°��� Ȯ�����ּ���.");
			scanner = new Scanner(System.in);
			return inputSelectWorkHandler();
		}
	}

	private static int checkInputSelectWorkHandler(int input) {
		if (input == ORDER || input == PAYMENT || input == EXIT) {
			return input;
		}
		throw new IllegalArgumentException();
	}

	public static int inputSelectTableHandler(List<Table> tables) {
		try {
			return checkInputSelectTableHandler(tables, scanner.nextInt());
		} catch (InputMismatchException | IllegalArgumentException e) {
			System.out.println("�Է°��� Ȯ�����ּ���.");
			scanner = new Scanner(System.in);
			return inputSelectTableHandler(tables);
		}
	}

	private static int checkInputSelectTableHandler(List<Table> tables, int input) {
		boolean isExistTableNumber = false;
		for (Table table : tables) {
			if (table.getNumber() == input) {
				isExistTableNumber = true;
			}
		}
		if (isExistTableNumber == true) {
			return input;
		}
		throw new IllegalArgumentException();
	}

}
