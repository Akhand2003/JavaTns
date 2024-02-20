package com.java.ifstatement;

public class IfStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ifstatement();
		ifelsestatement();
		ifelseladder();
	}
	static void ifstatement()
	{
		boolean isValid=true;
		if(isValid)
		{
			System.out.println("true");
		}
	}
	static void ifelsestatement()
	{
		boolean isValid= false;
		if(isValid) {
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}
	static void ifelseladder()
	{
		int marks=70;
		if(marks >= 90)
			System.out.println("A grade");
		else if(marks >= 80)
			System.out.println("B grade");
		else if(marks >= 70)
			System.out.println("C grade");
		else
			System.out.println("failed...");
	}
	static void switchStatement()
	{
		char ch= '7';
	//	switch(ch)
	//		{
	//			case '1':  System.out.println("Monday"); break;
	//			case '7': System.out.println("Sunday"); break;
	//			case '8': System.out.println("Sunday +"); break;
	//			default: System.out.println("Invalid Input");
	//	}
	//	After JAVA 8
		switch(ch)
			{
			case '1'->  System.out.println("Monday");
			case '7'-> {
						System.out.println("this is case 7");
						System.out.println("Sunday");
						}
			
			case '8'-> System.out.println("Sunday +");
			default-> System.out.println("Invalid Input");
			
			}
	}
	static void ternaryOperation() {
		int a = 10;
		int b= 20;
		int c= 15;
		int greater = (a>b)?a:b;
		System.out.println("Greater number in a and b is:" + greater);
		
		greater= (a>b)?(a>c)?a:c:(b>c)?b:c;
		System.out.println("Greater number in a , b and c is:" + greater);
	
	}
}
