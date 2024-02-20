package com.java.aggregation;

import com.java.aggregation.address.Address;
import com.java.aggregation.student.Student;

public class MainAggregation {

	public static void main(String[] args) {
		Student vishal = new Student();
//		vishal.setRollNo(1);
//		vishal.setName("Vishal");
//		vishal.setAge((byte)20);
//		vishal.setAddress(new Address("Pink City", 320001, "Hawa Mahal", true));
		
		Address address = new Address();
		address.setCity("Jaipur");
		address.setLandMark("Hawa Mahal");
		address.setPincode(3210001);
		address.setCurrecntAddress(false);
		
		vishal.setAddress(address);
		
// 		Null Pointer Exception in case address object is null
//		System.out.println(vishal.getAddress().getCity());
		System.out.println(vishal);
		
		
		
		Student sachin = new Student();
		
		sachin.setRollNo(2);
		sachin.setName("Sachin");
		sachin.setAge((byte) 20);
		
		sachin.setAddress(new Address("Blue City", 210001, "Mahal", true));
		
		Address sachinAddress = sachin.getAddress();
		
		
		System.out.println(sachinAddress.getCity());
	}
}
