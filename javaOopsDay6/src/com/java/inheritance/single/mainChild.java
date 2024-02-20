package com.java.inheritance.single;
import com.java.inheritance.single.classes.Child;
public class mainChild {
	public mainChild() {
		Child child=new Child();
		child.setFirstName("Kabir");
		child.setLastName("Ahlawar");
		System.out.println(child.getFirstName()+child.getLastName());
		//Constructors are not inherited to child class
//		Child child1=new Parent();
		Child child2 = new Child("Raj","Singhaniya");
		System.out.println(child2.getFirstName()+child2.getLastName());
		
		}
		public static void main(String[] args) {
			mainChild obj=new mainChild();
		}
}
