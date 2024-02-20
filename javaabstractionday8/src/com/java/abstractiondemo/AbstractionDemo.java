package com.java.abstractiondemo;

import com.java.abstraction.arithmaticoperation.AbstractArithmaticOperation;
import com.java.abstraction.arithmaticoperation.ArithmaticOperation;

public class AbstractionDemo {

	public static void main(String[] args) {
		//Parent class
		AbstractArithmaticOperation abstractOperation = 
				new AbstractArithmaticOperation();
		
		System.out.println(abstractOperation.add());
		
		//Child class
		ArithmaticOperation operation = new ArithmaticOperation(10,20);
		System.out.println(operation.add());
		
		AbstractArithmaticOperation abstractOperation = operation;
		
		abstractOperation.add();
		
		System.out.println(abstractOperation.add());
		
		abstractOperation.printHello();
	}
}
