package com.javaex.practice02;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번: ");
		int num = sc.nextInt();
		
		if(num % 3 == 0) {
			System.out.print("A팀 입니다.");
		}else if(num % 3 == 1) {
			System.out.print("B팀 입니다.");
		}else if(num % 3 == 2) {
			System.out.print("C팀 입니다.");
		}else {
			System.out.println("잘못입력하셨습니다.");
		}
		
		
		sc.close();
		
	}

}
