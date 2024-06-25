package com.javaex.practice02;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
			
		int age;
		
		System.out.println("나이를 입력해주세요.");
		System.out.print("나이: ");
		age = sc.nextInt();
		
		if(age > 20) {
			System.out.print("\"1번 그룹\"");
		}else {
			System.out.print("\'2번 그룹\'");
		}
		System.out.println(" 입니다.");
		
		sc.close();
	}

}
