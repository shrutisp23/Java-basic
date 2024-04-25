package com.rays;

public class NotesCount {
    public static void main(String[] args) {
	int number=5663;
	int notes[]= {1000, 2000,500,200,100,5,1};
	int count=0;
	
		 for(int i =0;i<notes.length;i++) {
			 count = number/notes[i];
			 number = number%notes[i];
			 
			if (count>0) {
				System.out.println("notes of  "+notes[i] + " is " +count );
			}
		 }
	 
}
}
