package com.rays.io.externization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestExDeserialization {
	public static void main(String[] args) throws Exception {
		
	
	FileInputStream file = new FileInputStream("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Extobj.txt");

	ObjectInputStream in = new ObjectInputStream(file);

	Employee e = (Employee) in.readObject();

	System.out.println("id = " + e.id);
	System.out.println("name = " + e.name);
	System.out.println("address = " + e.address);
	System.out.println("salary = " + e.salary);

	in.close();
	file.close();
	}

}
