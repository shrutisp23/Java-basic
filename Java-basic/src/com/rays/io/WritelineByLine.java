package com.rays.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WritelineByLine {
	public static void main(String[] args) throws IOException {
		FileWriter file = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\write.txt" , true);
		PrintWriter out = new PrintWriter(file);
		out.println(" Hello bhai");
		out.print("How are you???");
		out.close();
		file.close();
		System.out.println("data write succesfully ....!!!!");
	}

}
