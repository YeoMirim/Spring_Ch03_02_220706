package com.mirim.test;

public class Calculator {	// 사칙연산 가능한 class

	
	public void add(int num1, int num2) {
		int result = num1 + num2;
		System.out.println("두 수의 합 : " + result);
		
	}
	
	public void sub(int num1, int num2) {
		int result = num1 - num2;
		System.out.println("두 수의 차 : " + result);
	}
	
	public void mul(int num1, int num2) {
		int result = num1 * num2;
		System.out.println("두 수의 곱 : " + result);
	}
	
	public void div(int num1, int num2) {
		int result = num1 / num2;
		System.out.println("두 수의 나누기 : " + result);
	}
}
