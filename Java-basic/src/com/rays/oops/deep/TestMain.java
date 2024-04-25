package com.rays.oops.deep;

public class TestMain {
	public static void main(String[] args) throws CloneNotSupportedException {
		 Address permanentAddress = new Address("123 Main St", "City", "State", "12345");
	        Address localAddress = new Address("456 Delhi ", "City", "State", "54321");
	        Employee employee = new Employee("shruti patel", permanentAddress, localAddress);
	        
	        
	        Department department = new Department("Engineering");
	        
	        
	     // Deep clone the department object
	
	       Department clonedDepartment = (Department) department.clone();
	       // Modify the cloned department
	        clonedDepartment.setName("Human Resources");

	        // Verify original department is not affected
	        System.out.println("Original Department Name: " + department.getName()); // Output: Engineering
	        System.out.println("Cloned Department Name: " + clonedDepartment.getName()); // Output: Human Resources
	}

}
