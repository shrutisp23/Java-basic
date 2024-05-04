package com.rays.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SpliitLine1 {
	public static void main(String[] args) throws IOException {
		FileReader file = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\Split.txt");
		BufferedReader in = new BufferedReader(file);
		String line = in.readLine();
		int i = 1;

		while (line != null) {
			FileWriter file1 = new FileWriter("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\SplitFile" + i + ".txt");
			PrintWriter out = new PrintWriter(file1);

			for (int j = 1; j <= 2; j++) {
				out.print(line);
				line = in.readLine();
			}

			i++;
			out.close();
		}
	}
}
