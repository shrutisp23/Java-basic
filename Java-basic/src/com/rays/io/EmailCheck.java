package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EmailCheck {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Emails.txt");
	     BufferedReader in = new BufferedReader(file);
	     
	     FileWriter file1 = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\CorrectEmails.txt");
			PrintWriter out = new PrintWriter(file1);
	     
			FileWriter file2 = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\InCorrectEmails.txt");
			PrintWriter out1 = new PrintWriter(file2);
			
			
	     String rex = "^(.+)@(.+)$";
	     String line = in.readLine();
	     System.out.println(line);
	     while(line!=null) {
	    	 
	    	if( line.matches(rex)) {
	    		
	    		out.write(line);
	    		out.print("\n");
	    	}else {
	    		out1.print(line);
	    		out1.print("\n");
	    	}
	    	line = in.readLine();
	    	System.out.println(line);
	    	
	    	 
	     }
	        out.close();
	    	out1.close();
	}

}
