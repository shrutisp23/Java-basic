package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class MergeLines {
  public static void main(String[] args) throws IOException {
	 
	    
	    FileWriter file = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Merge.txt");
		PrintWriter out = new PrintWriter(file);
	    
	  for(int i= 1;i<12;i++) {
		
    FileReader file1 = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Split" + i + ".txt");
    BufferedReader in = new BufferedReader(file1);
    
   
     
    String line = in.readLine();
    out.print(line);
    
    out.print("\n");
    
     String line2 = in.readLine();
     out.print(line2);
   
     out.print("\n");
  
	  }
	  out.close();
	  file.close();
	  
    
}
}
