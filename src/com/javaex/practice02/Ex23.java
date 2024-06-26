package com.javaex.practice02;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("태어난 년도를 입력해 주세요.");
		System.out.print("년도: ");
		int year1 = sc.nextInt();
		int age = 2024 - year1;
		int year2 = 2024;
		
		
		System.out.println("올해: 2023");
		System.out.println("태어난해: " + year1);
		System.out.println("나이: " + (year2 - year1));
		System.out.println("========================");
		
		if(age >= 20) {
			System.out.println("20살 이상");
			
			if(year2 % 2 == 0 && year1 % 2 == 0) {
			System.out.println("건강검진해");
				
			if(age >= 40) {
					System.out.println("암 검사");
			}else {
				System.out.println("암 검사x");
			}
			}else {
				System.out.println("건강검진해 아님");
			}
			
		}else {
			System.out.println("20살 미만 건강검진대상이 아님");
		}
		
		
		sc.close();
		
	}

}
