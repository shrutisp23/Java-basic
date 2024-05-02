package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SplitLines {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Split.txt");
	     BufferedReader in = new BufferedReader(file);
	     String line = in.readLine();
	     
	        int i = 1;
	          while(line!=null) {
	 			 
	        	String s = "C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Split" +i+ ".txt";
	 			 
//	 			FileWriter file1 = new FileWriter("s");
//	 			PrintWriter out = new PrintWriter(file1);
//	 			
//	 			out.print(line);
//	 	    	
//	 	    	
//	 	    	if(line!=null) {
//	 	     
//	 	    	out.print(line);
//	 	    	
//	 	    	}
//	 	    	
//	 	    	i++;
//	 	    	out.close();
//	 	    	file1.close();
//	 	    	
//	          }
	        	
	 			
        FileWriter file1 = new FileWriter(s); 
	      
	 		        file1.write(line);
	 	         	file1.write('\n');
	           	 line = in.readLine(); 
	    	      if(line!=null) {
	    	       file1.write(line);
	    	       }
	    	      line = in.readLine();
	           	 i++;
	           	 file1.close();
	    	
	    	 
	    	 
	}
	}

}
