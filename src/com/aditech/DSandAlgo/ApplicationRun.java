package com.aditech.DSandAlgo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationRun {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setFirstName("Aditya");
		emp.setAge(27);
		
		Employee emp1 = new Employee();
		emp1.setFirstName("XYZ");
		emp1.setAge(28);
		
		Employee emp2 = new Employee();
		emp2.setFirstName("XYZ");
		emp2.setAge(28);
		
		Map<Employee, Object> hm = new HashMap<Employee, Object>();
		hm.put(emp, "Object1");
		hm.put(emp1, "Object2");
		hm.put(emp2, "Object3");
		
		System.out.println(hm.size());
		
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(1);
		list.add(4);
		list.add(5);
		list.add(2);
		
	}
	
}
