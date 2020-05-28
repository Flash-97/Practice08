package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("친구를 3명 등록해 주세요");

		Friend friend[] = new Friend[3];

		for (int i = 0; i < friend.length; i++) {
			friend[i] = new Friend();
			String a = sc.nextLine();
			String sArray[] = a.split(" ");
			friend[i].setName(sArray[0]);
			friend[i].setPhone(sArray[1]);
			friend[i].setSchool(sArray[2]);
		}
		for (int i = 0; i < friend.length; i++) {
			friend[i].showInfo();
		}

		sc.close();

	}

}