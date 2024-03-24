package com.sathya.collections;

public class Test {

	public static void main(String[] args) {
		Employee employee=new Employee(1,"vijaya",2000.0);
		System.out.println(employee);
		
		Employee employee2=new Employee();
		employee2.setEmpid(1);
		employee2.setEmpname("vijaya");
		employee2.setEmpsalary(277867867);
		System.out.println(employee2);
		
		
		
		
	}

}