package com.javaex.practice02;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력해주세요: ");
		int age = sc.nextInt();
		
		if(age > 19 && age <= 65) {
			System.out.print("1번그룹");
		}else {
			System.out.print("2번그룲");
		}
		
		System.out.println(" 입니다.");
		
		sc.close();
	}

}
