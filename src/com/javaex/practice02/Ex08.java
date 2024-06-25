package com.javaex.practice02;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("키와 몸무게를 입력해주세요.");
		System.out.print("키: ");
		double tall = sc.nextDouble();
		
		System.out.print("몸무게: ");
		double kg = sc.nextDouble();
		
		double bmi = tall * tall / kg;
		float papago = (float)(tall * tall) * 22;
		
		if(bmi < 18.5) {
			System.out.print("저체중 ");
		}else if(bmi >= 18.5 && bmi <= 24.9) {
			System.out.print("정상 ");
		}else {
			System.out.print("과체중 ");
		}
		
		System.out.println("입니다.");
		System.out.println("표준체중: " + papago );
		
		sc.close();
	}

}
