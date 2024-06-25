package com.javaex.practice02;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();
		int result1;
		int result2;
		
		if(num1 > num2) {
			result1 = num1 / num2;
			result2 = num1 % num2;
		}else {
			result1 = num2 / num1;
			result2 = num2 % num1;
		}
		
		System.out.println("몫: " + result1);
		System.out.println("나머지: " + result2);
		sc.close();
		
	}

}
