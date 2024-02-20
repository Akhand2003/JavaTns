package com.java.accessmodifiers;

public class App {
	//private instance variable
		static String message;
		
		public static void main(String[] args) {
			showMessage();
			Display display = new Display();
			display.age=10;
		}
		
		//private instance method
		static void showMessage() {
			System.out.println(message);
		}
}
