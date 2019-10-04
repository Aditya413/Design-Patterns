package com.aditech.DesignPatterns.creational;

import java.util.ArrayList;
import java.util.List;

public class PrototypeEmployee implements Cloneable{
	private List<String> empList;
	
	public PrototypeEmployee() {
		empList = new ArrayList<String>();
	}
	
	public PrototypeEmployee(List<String> list) {
		this.empList = list;
	}
	
	public void loadData() {
		empList.add("Aditya");
		empList.add("Aditi");
		empList.add("Mahesh");
		empList.add("Priti");
	}
	
	public List<String> getEmpList() {
		return empList;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		this.getEmpList().forEach(emp -> temp.add(emp));
		return new PrototypeEmployee(temp);
	}
}
