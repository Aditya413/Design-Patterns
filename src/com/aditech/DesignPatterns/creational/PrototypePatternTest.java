package com.aditech.DesignPatterns.creational;

import java.util.List;

public class PrototypePatternTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		PrototypeEmployee emp = new PrototypeEmployee();
		emp.loadData();
		
		// Use the clone method to get the cloned object 
		PrototypeEmployee empClone1 = (PrototypeEmployee) emp.clone();
		PrototypeEmployee empClone2 = (PrototypeEmployee) emp.clone();
		
		List<String> empList = empClone1.getEmpList();
		empList.add("Dadi");
		
		List<String> empList2 = empClone2.getEmpList();
		empList2.remove("Dadi");
		
		System.out.println("Original List = " + emp.getEmpList());
		System.out.println("Clone List 1 = " + empList);
		System.out.println("Clone List 2 = " + empList2);
	}

}
