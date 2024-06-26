package com.javaex.practice02;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("수익을 입력해주세요.");
		System.out.print("수익: ");
		double price = sc.nextDouble();
		double result;
		
		if(price >= 0 && price <= 1000) {
			result = price * 0.09;
			System.out.println("소득세는 " + result + "입니다.");
		}
		else if(price > 1000 && price <= 4000) {
			result = (1000 * 0.09) + 0.18 * (price - 1000);
			System.out.println("소득세는 " + result + "입니다.");
		}
		else if(price > 4000 && price < 8000) {
			result = (1000 * 0.09) + (3000 * 0.18) + 0.27 * (price - 4000);
			System.out.println("소득세는 " + result + "입니다.");
		}
		else if(price >= 8000){
			result = (1000 * 0.09) + (3000 * 0.18) + (4000 * 0.27) + 0.36 * (price - 8000);
			System.out.println("소득세는 " + result + "입니다.");
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
		
		
		sc.close();
		
	}

}
