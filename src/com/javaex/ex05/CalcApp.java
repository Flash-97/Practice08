package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
		int num = 0;
		int num1 = 0;
		String sum;
		boolean exit = true;
		try {
			while (exit) {

				System.out.print(">>");
				String a = sc.nextLine();
				String sArray[] = a.split(" ");

				if (sArray.length == 1) {
					sum = sArray[0];
				} else {
					num = Integer.parseInt(sArray[0]);
					sum = sArray[1];
					num1 = Integer.parseInt(sArray[2]);
				}

				switch (sum) {
				case "+":
					Add add = new Add();
					add.setValue(num, num1);
					System.out.println(add.calculate());
					break;

				case "-":
					Sub sub = new Sub();
					sub.setValue(num, num1);
					System.out.println(sub.calculate());
					break;

				case "/":
					Div div = new Div();
					div.setValue(num, num1);
					System.out.println(div.calculate());
					break;

				case "*":
					Mul mul = new Mul();
					mul.setValue(num, num1);
					System.out.println(mul.calculate());
					break;

				case "/q":
					System.out.println("종료합니다.");
					exit = false;
					break;

				default:
					System.out.println("알 수 없는 연산입니다.");
					break;
				}
			}
		} catch (NumberFormatException e) {
			System.out.println("error");
		}
	sc.close();
    }
}
