package view;

import java.util.Scanner;

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
    public static int inputTableNumber() {
        System.out.println("## �ֹ��� ���̺��� �����ϼ���.");
        return scanner.nextInt();
    }


}
