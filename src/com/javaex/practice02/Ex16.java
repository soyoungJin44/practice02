package com.javaex.practice02;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요");
		System.out.print("숫자: ");
		double num1 = sc.nextDouble();
		double result;
		
		if(num1 <= 0) {
			result = (num1 * num1 * num1) - (9 * num1) + 2;
		}else {
			result = (7 * num1) + 2;
		}
		
		System.out.println("계산결과는 " + result + "입니다.");
		
		sc.close();
		
	}

}
