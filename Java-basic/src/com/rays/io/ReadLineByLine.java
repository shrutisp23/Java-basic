package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadLineByLine {
public static void main(String[] args) throws IOException {
	FileReader file = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\hello.txt");
     BufferedReader in = new BufferedReader(file);
     String line = in.readLine();
     while(line!=null) {
    	 System.out.println(line);
    	 line = in.readLine();     }
}

}
