package com.rays.oops.methodreturn;

public class Person {
	public String firstName;
	public String  lastName;
	public Person(String firstName, String lastName) {
		this.firstName = firstName ;
		this.lastName = lastName;
	}
	
public String toString() {
	return firstName+ " " +lastName;
	
}
public static void main(String[] args) {
	Person p = new Person("Shruti", "Patel");
	System.out.println(p.toString());
}

}
