package com.javaex.practice02;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String s = sc.nextLine();
		
		String result = "";
		
		switch(s) {
		case "a":
			result = "모음입니다.";
			break;
		case "e":
			result = "모음입니다.";
			break;
		case "i":
			result = "모음입니다.";
			break;
		case "o":
			result = "모음입니다.";
			break;
		case "u":
			result = "모음입니다.";
			break;
			
		default:
			result = "자음입니다.";
			break;
			
		}System.out.println(result);	
		
		sc.close();
		
	}

}
