package com.javaex.practice02;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(점수)를 입력해주세요.");
		System.out.print("사번: ");
		int num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("잘못된 사번입니다.");
		}else if(num % 3 == 0) {
			System.out.println("A팀 입니다.");
		}else if(num % 3 == 1) {
			System.out.println("B팀 입니다.");
		}else if(num % 3 == 2) {
			System.out.println("C팀 입니다.");
		}
		
		sc.close();
		
	}

}
