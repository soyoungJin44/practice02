package com.javaex.practice02;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호: ");
		String p = sc.nextLine();
		
		System.out.print("숫자1: ");
		double num1 = sc.nextDouble();
		System.out.print("숫자2: ");
		double num2 = sc.nextDouble();
	
		double result = 0.0;
		
		switch(p) {
		case "+" :
			result= num1 + num2;
			System.out.println("결과는: " + result);
			break;
		case "-" :
			result = num1 - num2;
			System.out.println("결과는: " + result);
			break;
		case "*" :
			result = num1 * num2;
			System.out.println("결과는: " + result);
			break;
		case "/" :
			if(num2 == 0) {
				System.out.println("계산할수없습니다.");
				break;
			}else{
				result = num1 / num2;
			System.out.println("결과는: " + result); 
			break;}
			
		
		default : 
			 if(p != "+" && p != "-" && p != "*" && p != "/") {
				System.out.println("계산할수없는 기호입니다.");
				
			}
			}
			
		}
		
		
}
		
		
		




