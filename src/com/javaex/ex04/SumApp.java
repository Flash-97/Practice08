package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();

		// 코드를 작성하세요

		// parseInt() 문자열을 숫자로 변환.

		String num[] = numLine.split(" ");
		sc.close();
		for (int i=0; i<num.length; i++) {
			System.out.println(num[i]);
			sum += Integer.parseInt(num[i]);
		}
		System.out.println("합:" + sum);

	}
}