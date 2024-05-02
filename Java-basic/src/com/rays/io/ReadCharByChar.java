package com.rays.io;

import java.io.FileReader;
import java.io.IOException;

public class ReadCharByChar {
public static void main(String[] args) throws IOException {
FileReader file = new FileReader("C:\\Users\\91930\\OneDrive\\Desktop\\IO\\hello.txt");
int ch = file.read();
while(ch!=-1) {
	System.out.print((char)ch);
	ch = file.read();
}

file.close();
}
}
